import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long a=sc.nextLong();
		long b=sc.nextLong();
		long k=sc.nextLong();
		
		
		if(a>=k)System.out.println(a-k+" "+b);
		else System.out.println(0+" "+Math.max(0,b-k+a));
	}
}