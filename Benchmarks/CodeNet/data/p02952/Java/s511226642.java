import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 100000)
            System.out.println(90909);
        else if (n >= 10000)
            System.out.println(n - 10000 + 1 + 999);
        else if (n >= 1000)
            System.out.println(909);
        else if (n >= 100)
            System.out.println(n - 100 + 1 + 9);
        else if (n >= 10)
            System.out.println(9);
        else
            System.out.println(n);
    }
}