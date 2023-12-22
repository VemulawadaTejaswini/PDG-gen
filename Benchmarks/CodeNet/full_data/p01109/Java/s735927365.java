import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumsum = 0;

        while (true) {


            int n = sc.nextInt();
            sumsum += n;
            if( n == 0 || sumsum > 50000) {
                break;
            }
            int sum = 0;
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
                sum += array[i];
            }

            int ave = sum / n;

            int num = 0;
            for ( int i = 0; i < n; i++ ) {
                if( array[i] <= ave ) {
                    num++;
                }
            }

            System.out.println(num);


        }
        sc.close();

    }

}

