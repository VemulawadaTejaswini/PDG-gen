import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        long K = sc.nextLong();
        String S = String.valueOf(s);
        int n = S.length();
        if(n == 1){
            System.out.println(S);
        }else{
             String[] a = new String[n];
            a = S.split("");
            int[] b = new int[n];
            for(int i = 0; i < n; i++){
                b[i] = Integer.parseInt(a[i]);
            }
            int count = 0;
            int ans = 0;
            for(int i = 0; i < K; i++){
                if(b[i] != 1){
                    ans = b[i];
                    break;
                }
            }
            System.out.println(ans);
        }
       
    }
}
