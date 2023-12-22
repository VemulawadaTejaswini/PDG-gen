import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i =0; i< 10; i++){
            int a = scan.nextInt();
            arr[i] = a;
        }
        Arrays.sort(arr);
        System.out.println(arr[9]);
        System.out.println(arr[8]);
        System.out.println(arr[7]);

    }
}