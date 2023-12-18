import java.util.Scanner;
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt();
                
                double sum = 0;
                double tmp = 0;

                for (int i=0; i<num; i++) {
                        double money = scan.nextDouble();
                        String unit = scan.next();
                        if ( unit.equals("BTC") ) {
                            tmp = money * 380000;
                        }
                        else {
                            tmp = money;
                        }
                        sum += tmp;
                }
                
                System.out.println( sum );
                scan.close();
        }
}