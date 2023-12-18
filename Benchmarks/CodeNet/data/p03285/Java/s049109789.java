import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n= scan.nextInt();

		scan.close();
		int check=0;
		for(int i=0;i<=n/4;i++) {
			for(int j=0;j<=n/7;j++) {
				if(n==4*i+7*j) {
					check=1;
					System.out.println("Yes");
					break;
				}
			}
			if(check==1)break;
		}
		if(check==0)System.out.println("No");
	}

}