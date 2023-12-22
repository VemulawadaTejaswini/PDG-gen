import java.util.Scanner;

public class Main {
	public static int gcd(int m,int n) {
		while(true){
			int r;
			r=m%n;
			if(r==0) return n;
			m=n;
			n=r;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int m,n,ans;
		while(sc.hasNext()){
			m=sc.nextInt();
			n=sc.nextInt();
			ans=gcd(m,n);
			System.out.println(ans);
		}
	}
}