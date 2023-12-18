import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long y=sc.nextLong();
		long xy=y/x;
		int n=0;
		while(xy>=(long)Math.pow(2,n)) {
			n++;
		}
		System.out.println(n);
	}
}