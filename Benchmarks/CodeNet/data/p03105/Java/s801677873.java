import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt() / sc.nextInt(), c = sc.nextInt();
        if (ab < c) c = ab;
        System.out.println(c);
    }
}
