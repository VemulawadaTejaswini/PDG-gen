import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr = new int[3];
        arr[0] = a; arr[1] = b; arr[2] = c;
        Arrays.sort(arr);
        //int ans = arr[2];
        //ans += (arr[2] - arr[1]);
        //ans += (arr[1] - arr[0]);
        int ans = 0;
        ans += (arr[1] - arr[0]);
        ans += (arr[2] - arr[1]);
        System.out.println(ans);
    }
}