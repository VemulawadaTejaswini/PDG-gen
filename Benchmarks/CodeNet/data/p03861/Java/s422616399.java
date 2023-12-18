import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int x = scan.nextInt();
		scan.close();

		int cnt=0;
		for(int i=a;i<=b;i++) {
			if(i%x==0)cnt++;
		}
		System.out.println(cnt);
	}
}