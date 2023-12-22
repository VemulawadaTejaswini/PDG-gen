import java.util.Scanner;

//20180508
//02

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		int d = a / b;
		int r = a % b;
		double f = (float)a / b;

		System.out.println(d + " " + r + " " + f);

    	scanner.close();
    }
}

