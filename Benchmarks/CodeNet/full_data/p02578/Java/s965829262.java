import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = in.nextInt();
        int maxSoFar = arr[0];
        long ans = 0;
        for(int i : arr) {
            if(i > maxSoFar) {
                maxSoFar = i;
            } else {
                ans += (long) (maxSoFar - i);
            }
        }
        System.out.println(ans);
        in.close();
    }
}