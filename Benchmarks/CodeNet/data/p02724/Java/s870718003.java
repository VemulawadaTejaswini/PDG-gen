
import java.util.Scanner;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long X=sc.nextLong();
		long ans=0;
		while(X>=500) {
			X-=500;
			ans+=1000;
		}
		while(X>=5) {
			X-=5;
			ans+=5;
		}
		System.out.println(ans);


	}
}