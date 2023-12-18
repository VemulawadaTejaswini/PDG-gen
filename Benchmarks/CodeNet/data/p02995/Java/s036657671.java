package app;
import java.util.Scanner;
public class Main {
    public static void main(final String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        long A = scan.nextLong();
        long B = scan.nextLong();
        long C = scan.nextLong();
        long D = scan.nextLong();
        scan.close();
        long anti_division = 0;
        for( long i = A; i <= B; i++ ){
            if( i % C == 0 || i % D == 0 ){
                continue;
            }
            else {
                anti_division++;
            }
        }
        System.out.println(anti_division);
    }
}