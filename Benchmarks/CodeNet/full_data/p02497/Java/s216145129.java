import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int f = sc.nextInt();
		int r = sc.nextInt();

		while(m != -1 || f != -1 || r != -1){
			if(m == -1 && f == -1 && r == -1){
				break;
			}
			System.out.println("");
			if(m <= 50 && f <= 50 && r <= 100){

				if(m == -1 || f == -1) {
					System.out.println("F");
				}else if(m + f >= 80) {
					System.out.println("A");
				}else if(m + f >= 65) {
					System.out.println("B");
				}else if(m + f >= 50) {
					System.out.println("C");
				}else if(m + f >= 30) {
					if(r >= 50) {
						System.out.println("C");
					}else{
						System.out.println("D");
					}
				}else{
					System.out.println("F");
				}
				System.out.println("");
			}
			System.out.println("");

			m = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
		}
	}

}