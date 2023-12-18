import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean able = true;
        boolean[] overK = new boolean[n];
        int cntOverK = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int b = sc.nextInt();
            a[i] = b;
            if(b < k) able = false;
            else if(b > k){
                overK[i] = true;
                cntOverK++;
            }
        }
        if(n - cntOverK > k) able = false;
        if(able){
            StringBuilder sbOverK = new StringBuilder();
            for(int i = 1; i <= n; i++) {
                if(overK[i-1]) sbOverK.append(i);
            }
            StringBuilder sbEqK = new StringBuilder();
            for(int i = 1; i <= n; i++) {
                if(!overK[i-1]) sbEqK.append(i);
            }
            StringBuilder ans = new StringBuilder();
            for(int i = 1; i <= k; i++){
                ans.append(sbOverK.toString());
                ans.append(sbEqK.toString());
            }
            ans.append(sbOverK);
            System.out.println(n*k + cntOverK);
            System.out.println(ans.toString());
        }else{
            System.out.println("-1");
        }

        sc.close();
    }

}
