import java.util.Scanner;

public class Main {

	static int cnt;
	
	static int gcd(int a, int b){
		if(b==0){
			return a;
		}
		else{
			cnt++;
			return gcd(b,a%b);
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			if((a|b)==0){
				return;
			}
			cnt = 0;
			System.out.println(gcd(a,b)+" "+cnt);
		}
	}
}