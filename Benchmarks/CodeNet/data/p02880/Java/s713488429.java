
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();

		boolean f=false;
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(i*j==a) {
					f=true;
					break;
				}
			}
		}
		if(f)
			System.out.println("Yes");
		else
			System.out.println("No");



	}

}
