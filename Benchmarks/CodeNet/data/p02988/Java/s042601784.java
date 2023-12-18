import java.util.Scanner;
public class Main {
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[]=new int[n];
		int cnt=0;	
		for(int i=0;i<n;i++) {p[i]=sc.nextInt();}
		for(int i=0;i<n-2;i++) {
			int a=p[i];
			int b=p[i+1];
			int c=p[i+2];
			int mid = -9999;
			if(a > b && a < c || a > c && a < b || a == b || a == c )
			mid = a;
			else if(b > a && b < c || b > c && b < a || b == a || b == c )
			mid = b;
			else
			mid =c ;
			if(b==mid)cnt++;
		}
		System.out.println(cnt);
	}
}