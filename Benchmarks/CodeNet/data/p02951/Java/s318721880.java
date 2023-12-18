import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		sc.close();
		System.out.println(Math.max(C-(A-B), 0));
	}
}