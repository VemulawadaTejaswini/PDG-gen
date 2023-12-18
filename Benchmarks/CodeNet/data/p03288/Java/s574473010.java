
import java.util.Scanner;

class Main{
	public static void main(String[] main) {
		Scanner sc=new Scanner(System.in);

		int a=sc.nextInt();
		if(a<1200) {
			System.out.println("ABC");
		}
		else if(a>=1200 && a<2800) {
			System.out.println("ARC");
		}

		else if(a>=2800) {
			System.out.println("AGC");
		}
	}
}