import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long ans=(Math.pow(10,n)+Math.pow(8,n)-Math.pow(9,n)-Math.pow(9,n))%1000000007
		System.out.println(ans);
	}
		
}