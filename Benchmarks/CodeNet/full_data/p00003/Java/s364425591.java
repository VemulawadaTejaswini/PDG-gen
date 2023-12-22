import java.util.*;
class Main{
	public static void main(String[] a){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		for(int i = 0; i < N; i++){
			int a = scan.nextInt(), b = scan.nextInt(), c = scan.nextInt();
			if(a > b){
				int multi = a;
				a = b;
				b = multi;
			}
			if(b > c){
				int multi = b;
				b = c;
				c = multi;
			}
			if(a * a + b * b == c * c) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}