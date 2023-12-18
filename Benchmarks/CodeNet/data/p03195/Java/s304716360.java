
import java.util.Random;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		long b[]=new long[a];
		for(int i=0;i!=a;i++) {
			b[i]= scan.nextLong();
		}
		Random rand=new Random();
		int ans=rand.nextInt(2);
		if(ans==0) {System.out.println("first");}
		if(ans==1) {System.out.println("second");}
}
}