import java.util.*;

public class Main {

    static int array[];
    static int ans[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 1000 == 0)  {
            System.out.println(0);
            return;
        }

        System.out.println(1000 - (n % 1000));

        sc.close();

    }

}