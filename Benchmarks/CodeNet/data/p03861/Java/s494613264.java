import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong();
        long b = scan.nextLong();
        long x = scan.nextLong();
        long count  = b / x - a / x;
        if (a%x == 0 ) count++;

        System.out.println(count);

        scan.close();
    }
}