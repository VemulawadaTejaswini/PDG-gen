import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int X=sc.nextInt();
		int Y=sc.nextInt();
		int Z=sc.nextInt();
		int cnt=0,sum=Z;
		while(sum+Y+Z<=X) {
			sum+=Y+Z;
			cnt++;
		}
		System.out.println(cnt);
	}
}