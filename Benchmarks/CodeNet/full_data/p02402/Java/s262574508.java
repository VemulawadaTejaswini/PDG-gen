
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        int max = -1000000;
        int min = 1000000;
        
        for (int i = 0; i < n; i++) {
            int a = scan.nextInt();
            sum = sum + a;
            if( max < a ){
                max = a;
            }
            if( min > a ){
                min = a;
            }
        }

        System.out.println(min + " " + max +" " + sum);
    }
}

