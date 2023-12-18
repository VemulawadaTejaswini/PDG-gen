import java.util.Scanner;

import static java.lang.Math.min;

public class Frog1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(arr, 0));
    }

    public static int solution(int[] arr, int index) {

        //base case
        if (index == arr.length - 1) {
            return 0;
        } else if (index == arr.length - 2) {
            return Math.abs(arr[index] - arr[index + 1]);
        }

        //recursive case
        int min = 0;
        if (index + 2 <= arr.length - 1) {
            min = min((Math.abs(arr[index] - arr[index + 1]) + solution(arr, index + 1))
                    , (Math.abs(arr[index] - arr[index + 2]) + solution(arr, index + 2)));
        }
        return min;
    }

}
