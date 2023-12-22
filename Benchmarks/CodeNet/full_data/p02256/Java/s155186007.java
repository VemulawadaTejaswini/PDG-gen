import java.util.Scanner;
public class Main {
	public static void main(String[] arg){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a >= b){
			gcd(a,b);
		}else{
			gcd(b,a);
		}
	}
	
	static void gcd(int n,int m){
		if((n % m) == 0) {
			System.out.println(m);
		}else if(m == 1){
			System.out.println(1);
		}else{
			int m1 = (n % m);
			gcd(m,m1);
		}
	}
}