import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		int check=0;
		for(int i=n;i>0;i--) {
			for(int j=2;j<n;j++) {
				if(j*j ==i) {
					check=1;
					System.out.println(i);
					break;
				}
			}
			if(check==1)break;
		}

	}

}