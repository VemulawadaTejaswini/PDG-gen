
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] a = new int[n];
        int ans=0;
        for (int i = 0; i < k; i++) {
            ans=a[a[ans]];
        }
        System.out.println(ans);
    }
}
