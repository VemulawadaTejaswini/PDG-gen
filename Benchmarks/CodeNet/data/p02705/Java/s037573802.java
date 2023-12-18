import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		double x = 0;
		
		x = 3.14159265358979323*R;
		
		System.out.println(x);
		sc.close();
	}
}