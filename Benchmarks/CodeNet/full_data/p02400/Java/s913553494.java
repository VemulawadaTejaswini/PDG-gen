import java.util.Scanner;

public class???Main {

    public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		double men = (double)r * r * 3.1459;
		double ensyu = (double)r * 2 * 3.1459;

		System.out.println(men + " " + ensyu);
        scan.close();
    }

}