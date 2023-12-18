import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        Integer[] xArr = new Integer[n+1];
        for (int i = 0; i < n; i++) {
            xArr[i] = sc.nextInt();
        }
        xArr[n] = x;
        Arrays.sort(xArr, Comparator.naturalOrder());

        Integer[] distances = new Integer[n];
        for (int i = 0; i < n; i++) {
            int distance = xArr[i+1] - xArr[i];
            distances[i] = distance;
        }

        System.out.print(gcd(distances));
    }

    static int gcd(int a, int b) {
        int tmp;
        while((tmp = a%b) != 0) {
            a = b;
            b = tmp;
        }
        return b;
    }

    static int gcd(Integer[] arr) {
        int ans = arr[arr.length-1];
        for (Integer x : arr) {
            ans = gcd(ans, x);
        }
        return ans;
    }
}
