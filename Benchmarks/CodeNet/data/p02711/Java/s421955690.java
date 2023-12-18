import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String res = "No";
        if (n / 100 == 7)  res = "Yes";
        if ((n % 100) / 10 == 7) res = "Yes";
        if ((n % 100) % 10 == 7) res = "Yes";

        System.out.println(res);
    }
}