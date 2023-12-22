import java.util.*;

public class Main {
public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long a = scan.nextInt();
        long b = scan.nextInt();
        long c = scan.nextInt();
        long ancer=0;
        for (int x = 1; x <=c; x++) {
        ancer = (long)floor(a * x / b) + a * floor(x / b);
        
        }
        System.out.println(ancer);
        }

        public static int floor(double n) {
        return (int)n;
        }

        }