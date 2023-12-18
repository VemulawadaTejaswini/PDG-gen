import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int x = sc.nextInt();
        int num = k - 1;
        for(int i = x - num; i <= x + num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
