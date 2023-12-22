import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner cin =  new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        if(a > b) System.out.println("safe");
        else System.out.println("unsafe"); 
    }
}