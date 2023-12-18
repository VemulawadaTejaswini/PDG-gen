
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a=scan.nextLong();
		long ans=0;
		for(int i=0;i!=a;i++) {
			long b=scan.nextLong();
			if(b%2==1) {ans++;}
		}
		if(ans%2==1) {
			System.out.println("first");}
		else {System.out.println("second");}
    
}
}