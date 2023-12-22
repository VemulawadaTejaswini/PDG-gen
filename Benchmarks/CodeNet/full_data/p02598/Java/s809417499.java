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

        long start =0;

        long end = max;

        while (start +1 != end) {

            long mid = (start + end)/2;

            long need = 0;

            for (int i = 0; i < arr.length; i++) {

                long add = arr[i] % mid == 0 ? (arr[i]/mid)-1 : arr[i]/mid;
                
                need += add;
            }

            if (need <= K) end = mid;

            else start = mid;
        }

        System.out.println(end);
    }
}
