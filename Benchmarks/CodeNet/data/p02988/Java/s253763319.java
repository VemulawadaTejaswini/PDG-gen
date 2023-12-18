
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int way = 0;
        for (int i = 0; i < n - 2; i++) {
            if ((arr[i] > arr[i + 1] && arr[i + 1] > arr[i + 2]) || (arr[i] < arr[i + 1] && arr[i + 1] < arr[i + 2])) {
                way++;
            }
        }
        System.out.println(way);
    }

}
