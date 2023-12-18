import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt()*100;
		int b=scan.nextInt()*10;
		int c=scan.nextInt();
		if((a+b+c)%4==0) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}