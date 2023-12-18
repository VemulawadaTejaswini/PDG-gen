import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main { 

	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int inputScore = Integer.parseInt(sc.nextLine());
    	String[] inputNumber = sc.nextLine().split(" ");
    	double[] allNumber = new double[inputScore];
    	double all = 0;
    	for(int i = 0;i<inputScore;i++) {
    		double tmp = Double.parseDouble(inputNumber[i]);
    		all += 1/tmp;
    	}

    	
    	System.out.println(1/all);
    }
}