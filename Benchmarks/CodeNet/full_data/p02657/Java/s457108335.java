import java.util.*;

public class Main {

    public static void main(String args[]) {


        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int sum = 1;

        for (int i= 0; i< n; i++) {

            int x = scan.nextInt();
            sum *= x;
        }

        if ((double) sum > Math.pow(10, 18)) {
            System.out.println(-1);

        }
        else {
            System.out.println(sum);
        }


    }


}