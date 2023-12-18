import java.util.Scanner;
class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);			//文字の入力


		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		
		for(int i = 0;i < m;i++){
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
		}
		
		int keyleft = 0;
		int keyright = Integer.MAX_VALUE;
		
		int ans = 0;
		
		for(int i = 0;i < m;i++){
			if(l[i] > keyright || r[i] < keyleft ){
				System.out.println(0);
				return;
			}
			if(l[i] > keyleft){
				 keyleft = l[i];
			}
			if(r[i] < keyright ){
				keyright = r[i];
			}
		}
		
		System.out.print(keyright-keyleft+1);
		
	}


	static int gcd(int a,int b){				//最大公約数を返す
		if(b == 0){
			return a;
		}else{
			return gcd(b, a%b);
		}
	}





}



class Pair implements Comparable{
	int from;
	int end;
	@Override
	public int compareTo(Object other) {
		Pair otherpair = (Pair)other;

		return from - otherpair.from;
	}
}


