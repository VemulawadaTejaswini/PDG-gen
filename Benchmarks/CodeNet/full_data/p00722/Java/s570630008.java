
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
		int a = sc.nextInt();
		if(a==0) { break;}
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		a-=b;
		for(int count=0;count<c;a+=b) {
			if(sosuu(a+b)) {
				count++;
			}
		}
			System.out.println(a);
			
		}
		sc.close();
	}
	
	public static boolean sosuu(int a) {
		//素数ならtrueを返す
		if(a==1)return false;
		for(int i=2;i<=Math.sqrt(a);i++) {
			if(a%i==0) {
				return false;
			}
		}
		return true;
	}

}

