import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = sc.nextInt();
        }
        int min = 2;
        int max = 2;
        boolean able = true;
        for (int i = k-1; i >= 0; i--) {
            int r = (min + a[i] -1) / a[i];
            min = a[i] * r;
            if(max < min){
                able = false;
                break;
            }
            r = max / a[i];
            max = a[i] * r + a[i] - 1;
        }
        System.out.println(able ? min + " " + max : -1);
        sc.close();

    }

}
