import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner cin =  new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        int d = cin.nextInt();
        int ac = a / d + 1;
        int bd = c / b;
        if(ac < bd) System.out.println("No");
        else System.out.println("Yes");
    }
}