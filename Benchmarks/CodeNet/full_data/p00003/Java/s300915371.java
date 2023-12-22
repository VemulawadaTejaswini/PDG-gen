import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n1;
		int n2;
		int n3;
		int date;

		Scanner scan = new Scanner(System.in);

		date = scan.nextInt();

		for(int i = 0 ; i < date ;i++){
			n1 = scan.nextInt();
			n2 = scan.nextInt();
			n3 = scan.nextInt();

			if(n3 * n3 == n2*n2+n1*n1){
				System.out.println("YES");

			}else if(n2 * n2 == n3 * n3 + n1 * n1){
				System.out.println("YES");

			}else if(n1 * n1 == n3 * n3 + n2 * n2){
				System.out.println("YES");

			}else{
				System.out.println("NO");
			}
		}

	}

}