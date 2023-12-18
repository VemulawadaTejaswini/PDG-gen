import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++){
            if (i+1 == a[a[i]-1]){
                ans += 1;
            }
        }
        System.out.println(ans/2);
    }
}