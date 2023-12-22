import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int N = s.nextInt();

        int K = s.nextInt();

        int[] arr = new int[N];

        int max = 0;

        for (int i = 0; i  < N; i++) {

            arr[i]= s.nextInt();

            max = Math.max(max ,arr[i]);

        }

        int start =0;

        int end = max;

        while (start +1 != end) {

            int mid = (start + end)/2;

            int need = 0;

            for (int i = 0; i < arr.length; i++) {

                need += (arr[i]/ mid);
            }

            if (need <= K) end = mid;

            else start = mid;
        }

        System.out.println(end);
    }
}
