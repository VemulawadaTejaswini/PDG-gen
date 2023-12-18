import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);

        int res = Integer.MAX_VALUE;

        for (int i=arr[0]; i<=arr[arr.length-1]; i++) {
            int tmp = 0;
            for (int j=0; j<arr.length; j++) {
                tmp += (int)Math.pow(i - arr[j], 2);
            }
            res = Math.min(res, tmp);
        }

        System.out.println(res);


    }

}

