
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] a = new int[num];
        int[] result = new int[num];
        a[0] = 0;
        for (int i = 1; i < num; i++){
            a[i] = sc.nextInt();
        }
        for (int i = 1; i < num; i++){
            result[a[i] - 1]++;
        }
        for (int i = 0; i < num; i++){
            System.out.println(result[i]);
        }
    }
}
