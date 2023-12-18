import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static int count = 0;
    static List<Integer> L = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        for (int i = 0; i < N; i++){
            L.add(input.nextInt());
        }
        int[] arr = new int[5];
        combination(arr, 0, N, 3, 0);

        System.out.println(count);

    }

    public static void combination(int[] arr, int index, int n, int r, int target) {
        if (r == 0){
            count(arr);
        } else if (target == n) {
            return;
        } else {
            arr[index] = target;
            combination(arr, index + 1, n, r - 1, target + 1);
            combination(arr, index, n, r, target + 1);
        }
    }

    public static void count(int[] arr) {
        if (L.get(arr[0]) < L.get(arr[1]) + L.get(arr[2])){
            if (L.get(arr[1]) < L.get(arr[2]) + L.get(arr[0])){
                if(L.get(arr[2]) < L.get(arr[0]) + L.get(arr[1])){
                         count++;
                    }

                }
            }
        }


}
