import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

    	Scanner parameter = new Scanner(System.in);

    	String[] line1 = parameter.nextLine().split(" ");
        String[] line2 = parameter.nextLine().split(" ");

        double[] doubleNumber = new double[line2.length];

        for (int i = 0; i < line2.length; i++) {

        	doubleNumber[i] = Integer.parseInt(line2[i]);
        }

        Arrays.sort(doubleNumber);

        if (doubleNumber.length == 1) {

        	System.out.println(doubleNumber[0]);
        } else {

        	for (int i = 0; i < doubleNumber.length; i++) {

        		if (i < doubleNumber.length - 1) {

        			doubleNumber[i+1] = (doubleNumber[i] + doubleNumber[i+1]) / 2;
        		} else {

        			System.out.println(doubleNumber[doubleNumber.length - 1]);
        		}
            }
        }
    }
}
