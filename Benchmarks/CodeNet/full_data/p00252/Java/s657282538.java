import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int r,s,d;
			r = sc.nextInt();
			s = sc.nextInt();
			d = sc.nextInt();
			if (r == 1 && s == 1 && d == 0) {
				System.out.println("Open");
			} else if (r == 0 && s == 0 && d == 1){
				System.out.println("Open");
			} else System.out.println("Close");
	}
}