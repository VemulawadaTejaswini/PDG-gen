import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long ans=0;
		for(long i=n;i>0;i--) {
			if(i*i <= n) {
				ans=i*i;
				break;
			}
		}
		System.out.println(ans);
	}

}
