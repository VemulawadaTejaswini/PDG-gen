import java.util.*;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        int p = sc.nextInt();

        int[] a = new int[n];

        for (int i=0; i<n; i++) a[i] = sc.nextInt();
        Arrays.sort(a);

        int[] copy_a = a;

        int base_cnt = 0;

        int div = a[n-p];

        int idx = 0;

        for (int i=0; i<n; i++){
            if (a[i]==div){
                base_cnt = (n-i);
                idx = i;
                break;
            }
        }

//        System.out.println(idx);

        int plus = 0;

        int tmp_p = p;


        for (int i=idx-1; i>=0; i--){
            p = tmp_p;
            int diff = v-i-1;
            for (int j=0; j<diff; j++){
                if (p>=1){
                    a[n-1] += 1;
                    p -= 1;
                }else {
                    a[idx] += 1;
                    Arrays.sort(a, idx, n-1);
                }
            }
            if (a[i]>=a[n-tmp_p]){
                plus++;
            }
        }
        System.out.println(base_cnt+plus);

    }
}