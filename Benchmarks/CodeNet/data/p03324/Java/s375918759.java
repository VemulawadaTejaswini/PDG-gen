import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		int h = (int) Math.pow(100,d);
		int present = h*n;
		if(n == 100) {
			present+=h;
		}
		System.out.println(present);
	}
}