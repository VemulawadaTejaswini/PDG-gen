import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		int sq = (int)Math.sqrt((double)N);
		if((A+B>N+1) || (A<sq && B<sq)) System.out.println(-1);
		else System.out.println(1);
		return;
	}
}