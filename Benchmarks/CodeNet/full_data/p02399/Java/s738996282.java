import java.util.Scanner;

public class Main {


    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int d, r;
		double f;
		int a = scan.nextInt();
		int b = scan.nextInt();

		d = a / b;
		r = a % b;
		f = (double)a / b;

		System.out.println(d + " " + r + " " + f);
        scan.close();
    }

}