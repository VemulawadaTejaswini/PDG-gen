import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        while(true) {
            String testCase = sc.nextLine();

            if (testCase.equals("0 0 0")) {
                return;
            }
            String [] arrInput =  testCase.split(" ");
            System.out.println(maxNewTax(Integer.valueOf(arrInput[2]), Integer.valueOf(arrInput[0]), Integer.valueOf(arrInput[1])));
        }
    }

    public static int maxNewTax(int totalOldTax, int oldTax, int newTax) {
        int maxNewTax = 0;
        for (int valOldTax1 = 1; valOldTax1 < totalOldTax; valOldTax1++) {
            int valOldTax2 = totalOldTax - valOldTax1;

            int val1 = (int) Math.ceil(100 * (double) valOldTax1 / (100 + oldTax));
            if(valOldTax1 != calculateTax(val1, oldTax)) {
                val1 = (int) Math.floor(100 * (double) valOldTax1 / (100 + oldTax));
                if(valOldTax1 != calculateTax(val1, oldTax)) {
                    continue;
                }
            }


            int val2 = (int) Math.ceil(100 * (double) valOldTax2 / (100 + oldTax));
            if(valOldTax2 != calculateTax(val2, oldTax)) {
                val2 = (int) Math.floor(100 * (double) valOldTax2 / (100 + oldTax));
                if(valOldTax2 != calculateTax(val2, oldTax)) {
                    continue;
                }
            }


            int valNewTax = val1 * (100 + newTax)/100 + val2 * (100 + newTax)/100;
            maxNewTax = valNewTax > maxNewTax ? valNewTax : maxNewTax;
        }
        return maxNewTax;
    }

    public static int calculateTax(int val, int tax) {
        return val * (100 + tax) / 100;
    }
}
