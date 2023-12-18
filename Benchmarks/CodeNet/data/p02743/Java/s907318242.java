import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((long)4*a*b < ((long)c-a-b)*((long)c-a-b) ? "Yes" : "No");
    }
}
