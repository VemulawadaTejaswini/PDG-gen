import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		for(int i = 0; i<a; i++) {
			for(int j = 0; j<b; j++) {
				if(i>j) {
					System.out.println("Alice");
				}else if(i<j){
					System.out.println("Bob");
				}else {
					System.out.println("Draw");
				}
			}
		}
	}
}