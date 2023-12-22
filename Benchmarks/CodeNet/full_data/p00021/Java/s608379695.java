
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int c = 0;
        Scanner sc = new Scanner(System.in);
        Float[] inputData = new Float[8];

        int dataSet = sc.nextInt();
        while ( c < dataSet ) {
            for ( int i = 0; i < 8; i++ ) {
                inputData[i] = sc.nextFloat();
            }

            if ( (inputData[3] - inputData[1]) / (inputData[2] - inputData[0])
                 == (inputData[7] - inputData[5]) / (inputData[6] - inputData[4]) ) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
            c++;
        }
    }
}