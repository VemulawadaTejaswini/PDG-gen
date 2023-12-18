import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		long a;
		while(sc.hasNextInt()) {
			a=sc.nextLong();
		
		double m=Math.sqrt(a);
		int n;
		n=(int)m;
		for(int i=n;i>0;i--) {
			if(a%i==0) {
				System.out.println(i+a/i-2);
				break;
			}
		}
		}	
	}
}