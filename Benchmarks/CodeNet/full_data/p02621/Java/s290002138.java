import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println((int) (i + Math.pow(i, 2) + Math.pow(i, 3)));
    }
}