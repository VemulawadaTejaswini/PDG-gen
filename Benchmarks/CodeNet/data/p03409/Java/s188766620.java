import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main{

	//static long[] a;
	static	int N ;
	static	int M ;
	static long[][] dp;
	static int ans = 0;
	static	boolean[] flag ;
	static	int[] a ;
	static	int[] b ;
	static	int[] c ;
	static	int[] d ;

	static ArrayList<Pair> pairA;
	static ArrayList<Pair> pairB;



	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);			//文字の入力
		N = sc.nextInt();

		a = new int[N];
		b = new int[N];
		c = new int[N];
		d = new int[N];

		pairA = new ArrayList<Pair>();
		pairB = new ArrayList<Pair>();

		for(int i = 0;i < N;i++){
			Pair pair = new Pair();
			pair.from = sc.nextInt();
			pair.end = sc.nextInt();
			pairA.add(pair);
		}
		for(int i = 0;i < N;i++){
			Pair pair = new Pair();
			pair.from = sc.nextInt();
			pair.end = sc.nextInt();
			pairB.add(pair);
		}

		Collections.sort(pairA);
		Collections.sort(pairB);
		
//		System.out.println("a");
//		for(int i = 0;i < N;i++){
//		System.out.println(pairA.get(i).from +" " +pairA.get(i).end);
//		}
//		System.out.println();
//
//		System.out.println("b");
//
//		for(int i = 0;i < N;i++){
//			System.out.println(pairB.get(i).from +" " +pairB.get(i).end);
//			}

		flag = new boolean[N];

		dfs(0,0);

		System.out.println(ans);





	}

	static void dfs(int p,int sum){

		if(p == N){
			ans = Math.max(ans, sum);
			return;
		}



		for(int i =0;i < N;i++){
			if(!flag[i]){		
				if(pairA.get(i).end <pairB.get(p).end){
					if(pairA.get(i).from < pairB.get(p).from){
						sum++;
						flag[i] = true;
						dfs(p+1, sum);
						flag[i] = false;
						sum--;
					}
					
				}else{
					dfs(p+1, sum);
					return;
				}
				
				
			}
		}
		dfs(p+1, sum);
	}


}
class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return end - otherpair.end;
	}
}


