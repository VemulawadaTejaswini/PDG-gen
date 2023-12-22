import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        if(a == b)
        {
            System.out.println("a == b");
        }
        if(a < b)
        {
        System.out.println("a < b");
        }
        if(a > b)
        {
            System.out.println("a > b");
        }
 
    }
}