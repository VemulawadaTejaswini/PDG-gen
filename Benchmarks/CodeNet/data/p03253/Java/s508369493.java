import java.util.ArrayList;
import java.util.Scanner;

class Main{

	static char[][] map;
	static int H;
	static int W;
	static	int D ;
	static	int G ;
	static	int[] p;
	static	int[] c;
	static int ans = 0;
	static int N;
	static int M;
	static ArrayList<Integer> yakusu;

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();
		M = sc.nextInt();

		yakusu = new ArrayList<Integer>();
		makeyakusu(M);

		
		for(int i = 0;i < yakusu.size();i++){
			dfs(M/yakusu.get(i),1);
		}

		System.out.println((int)(ans % (Math.pow(10, 9)+7)));


	}


	static void dfs(int num,int count){
		if(num == 0){			//割り過ぎた時

			return;
		}


		if(count == N-1){						//ちょうどM-1個、数列がある時
			for(int i = 0;i < yakusu.size();i++){
				if(num == yakusu.get(i)){					//
					ans++;
					//System.out.println("i "+i +" num "+num );
				}
			}
			return;
		}

		for(int i = 0;i < yakusu.size();i++){
			if(num % yakusu.get(i) ==0){					//	割り切れる時のみ

				dfs(num/yakusu.get(i), count+1);
			}
		}


	}

	static void makeyakusu(int X){

		int i= 1;
		while(i <= X){
			if(X % i == 0){
				yakusu.add(i);
				i++;
			}else{
				i++;
			}
		}

		return;

	}



}



