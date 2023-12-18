import java.util.Scanner;


public class Main {

    public static void main(String[] args){
        final Scanner sc = new Scanner(System.in);
        final String s = sc.next();
        final long k = sc.nextLong();
        if (k >= 2) {
            System.out.println(2);
        } else {
            System.out.println(1);
        }
    }
}
