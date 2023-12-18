
import java.util.Scanner;

/**
 *
 * @author bhatti
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] p = new int[N];
        for (int i = 0; i < N; ++i) {
            p[i] = sc.nextInt();
        }
        int count = 0;
        
        for (int i = 0; i < N; i++) {
            if (i < N - 1) {
                if (p[i] == i + 1 || p[i + 1] == i + 2) {
                     swap(p, i, i + 1);   
                     count++;
                }
            }else{
                if (p[i] == i + 1) {
                     swap(p, i, i - 1);   
                     count++;
                }
            }
        }
        System.out.println(count);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
