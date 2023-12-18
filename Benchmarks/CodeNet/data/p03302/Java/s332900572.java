import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (n+m == 15) System.out.println("+");
        else if (n*m == 15) System.out.println("*");
        else System.out.println("x");
    }
}