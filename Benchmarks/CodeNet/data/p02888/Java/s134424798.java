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

        long ans = 0;

        for (int i=0; i<n-2; i++) {
            for (int j=i+1; j<n-1; j++) {
                int a = arr[i];
                int b = arr[j];
                int left = j+1;
                int right = n;
                while (left<right) {
                    int mid = (left+right)/2;
                    if (arr[mid]<a+b) {
                        left = mid+1;
                    } else {
                        right = mid;
                    }
                }                 
                ans += (left-j-1);

            }
        }

        System.out.println(ans);
    }

}
