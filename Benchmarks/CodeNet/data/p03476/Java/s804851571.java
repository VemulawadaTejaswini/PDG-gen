import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int Q = scan.nextInt();
			int []l = new int[Q];//奇数
			int []r= new int[Q];//奇数
			for(int i = 0;i<Q;i++) {
				l[i] = scan.nextInt();
				r[i] = scan.nextInt();
			}
			
			long[]s = new long[100002];
			
			for(int i = 0;i<100001;i++) {
				if(isprime(i)&&isprime((i+1)/2)) {
					s[i+1] = s[i]+1;
				}else {
					s[i+1] = s[i];
				}
				
			}
			
			for(int i = 0;i<Q;i++) {
				
				System.out.println(s[r[i]+1]-s[l[i]]);
				
			}
			
			
			
		}
		
		
	}
		private static boolean isprime(long x) {//素数判定、入力xが素数かtrue,falseで返す
		long i;
		if(x<2)return false;//まず２より小さいのは素数じゃない
		if(x==2)return true;//２は素数
		if(x%2==0)return false;//２で割り切れたら素数じゃない
		for(i =3;i*i<=x;i = i+2) {//それ以降iで割り切れたら素数じゃない
			if(x%i==0)
				return false;
		}
		return true;//for文回しても割り切れなかったらそれは素数
	}

}