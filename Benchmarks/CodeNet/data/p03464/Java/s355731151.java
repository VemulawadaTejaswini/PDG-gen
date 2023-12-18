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
        int max = 3;
        boolean able = true;
        if(a[k-1] == 2){
            for (int i = k-1; i >= 0; i--) {
                if(max < a[i]){
                    able = false;
                    break;
                }else{
                    int r = (int)Math.floor((double)max / a[i]);
                    max = a[i] * r + a[i] - 1;
                }
                if(min < a[i]) min = a[i];
                else {
                    int r = (int)Math.ceil((double)min / a[i]);
                    min = a[i] * r;
                }
            }
        }else{
            able = false;
        }
        System.out.println(able ? min + " " + max : -1);
        sc.close();

    }

}
