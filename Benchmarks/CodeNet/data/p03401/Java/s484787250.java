import java.util.*;

public class Main {

    Scanner sc = new Scanner(System.in);

    int MOD = (int)998244353;

    public static void main(String[] args) {
        new Main().run();
    }

    void run() {

        int n = sc.nextInt();

        int[] arr = new int[n+2];
        for (int i=1; i<n+1; i++) arr[i] = sc.nextInt();


        int sum = 0;

        for (int i=1; i<n+2; i++) {
            sum += Math.abs(arr[i]-arr[i-1]);
        }

        
        StringBuilder sb = new StringBuilder();

//        if (!((0 <= arr[0] && arr[0] <= arr[1]) || (arr[1] <= arr[0] && arr[0] <= 0))) {
//
//        }

        for (int i=0; i<n; i++) {
            if (!((arr[i] <= arr[i+1] && arr[i+1] <= arr[i+2]) || (arr[i+2] <= arr[i+1] && arr[i+1] <= arr[i]))) {
                if (arr[i] < arr[i+2]) {
                    if (arr[i+1] < arr[i]) {
                        sb.append(sum - Math.abs(arr[i+1]-arr[i]) * 2 + "\n");
                    } else {
                        sb.append(sum - Math.abs(arr[i+2]-arr[i+1]) * 2 + "\n");
                    }
                } else {
                    if (arr[i+1] < arr[i+2]) {
                        sb.append(sum - Math.abs(arr[i+1]-arr[i+2]) * 2 + "\n");
                    } else {
                        sb.append(sum - Math.abs(arr[i+1]-arr[i]) * 2 + "\n");
                    }
                }
            } else {
                sb.append(sum + "\n");
            }
        }

        System.out.println(sb.toString());
    }
}

