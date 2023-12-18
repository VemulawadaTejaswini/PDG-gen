import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] array = new int[220000];
        int left = array.length/2;
        int right = left+1;

        for (int i = 0; i < n; i++) {
            if (n%2 == (i+1)%2) {
                array[left--] = sc.nextInt();
            } else {
                array[right++] = sc.nextInt();
            }
        }
        for (int i = left+1; i < right; i++) {
            System.out.printf("%d ", array[i]);
        }
    }
}
