import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberA = sc.nextInt();
        int numberB = sc.nextInt();
        int numberC = sc.nextInt();

        if(numberA+numberB+numberC >= 22)
          System.out.println("bust");
        else
          System.out.println("win");
    }
}