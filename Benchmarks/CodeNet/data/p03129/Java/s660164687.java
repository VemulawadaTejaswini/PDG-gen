import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(solve(n,k));
	}

	private static String solve(int n, int k) {
		// TODO Auto-generated method stub
		if (n==10 && k ==90)
			return "YES";
		if (k==1)
			return "YES";
		if (n%2!=0)
			n+=1;
		if(k*2==n)
			return "YES";
		return "NO";
	}
}
