
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(sc.nextLine());
        int n0 = Integer.parseInt(sc.nextLine());
        int n1 = Integer.parseInt(sc.nextLine());

        int max = n1 - n0;
        int min = Math.min(n0, n1);

        for(int i = 2; i < n; i++){
            int a = Integer.parseInt(sc.nextLine());
            max = Math.max(max, a - min);
            min = Math.min(min, a);
        }
        System.out.println(max);
    }
}
