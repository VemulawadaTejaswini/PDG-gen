import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d=sc.nextInt(),n=sc.nextInt();
		if(d==1)d = 100;
		else if(d==2)d = 10000;
		int ans = n*d;
		System.out.println(ans<n+1?n+1:ans);
	}
}
