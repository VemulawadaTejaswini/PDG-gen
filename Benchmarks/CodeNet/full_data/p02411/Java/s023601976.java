import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int m = sc.nextInt();
			int f = sc.nextInt();
			int r = sc.nextInt();
			if (m == -1 && f == -1 && r == -1){
				break ;
			}
			if (m == -1 || f == -1) {
				System.out.println("F\n");
			}else if(m + f >= 80){
				System.out.println("A\n");
			}else if(m + f >= 65){
				System.out.println("B\n");
			}else if(m + f >= 50){
				System.out.println("C\n");
			}else if(m + f >= 30){
				if (r >= 50){
					System.out.println("C\n");
				}else{
					System.out.println("D\n");
				}
			}else{
				System.out.println("F\n");
			}
		}
	}
}
