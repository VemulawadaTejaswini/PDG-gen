import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] sortedArr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr);
        int medianBig = sortedArr[N/2];
        int medianSmall = sortedArr[N/2-1];
        for(int a : arr) {
            if(a >= medianBig) System.out.println(medianSmall);
            else System.out.println(medianBig);
        }
    }
}
