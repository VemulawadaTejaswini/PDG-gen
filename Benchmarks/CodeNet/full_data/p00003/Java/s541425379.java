import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a, b, c;
		boolean flg;
		for(int i = 0; i < n; i++){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a >= b && a >= c){
				flg = pita(a, b, c);
			}else if(b >= a && b >= c){
				flg = pita( b, a, c);
			}else{
				flg = pita( c, a, b);
			}
			if(flg){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
	public static boolean pita(int a, int b, int c){
		if( a * a == b * b + c * c){
			return true;
		}
		return false;
	}
}