import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }

        for (int i=1; i<n; i++)
        {
            if (i%15==0)
               arr[i] = 0;

            else if (i%5==0)
                arr[i] = 0;

            else if (i%3==0)
                arr[i] = 0;

        }

        long sum = Arrays.stream(arr).sum();

        System.out.println(sum);



    }}