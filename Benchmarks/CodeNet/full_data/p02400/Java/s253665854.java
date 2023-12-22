import java.util.Scanner;

//20180508
//03

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		double r = scanner.nextFloat();

		double area = 2 * r * Math.PI;
		double length = Math.pow(r, 2) * Math.PI;

		System.out.println(area + " " + length);

    	scanner.close();
    }
}

