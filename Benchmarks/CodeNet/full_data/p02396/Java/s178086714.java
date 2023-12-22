import java.util.Scanner;

/**
 * Created by malone on 2018/3/9.
 */
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int[] a = new int[10000];
        while (true) {
            a[i] = scanner.nextInt();
            if (a[i] == 0) {
                break;
            }
            i++;
        }
        int j = 0;

        while (a[j] != 0) {
            System.out.printf("Case%d: %d\n",j+1,a[j]);
            j++;

        }
      


    }
}

