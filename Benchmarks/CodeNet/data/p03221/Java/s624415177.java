import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] p = new int[m];
        long[] y = new long[m];
        for(int i = 0; i < m; i++){
            p[i] = sc.nextInt();
            y[i] = sc.nextLong();
        }
        int[] ans1 = new int[m];
        int[] ans2 = new int[m];
        for(int i = 0; i < m; i++){
            ans1[i] = p[i];
        }
        for(int i = 0; i < n; i++){
            ArrayList<Long> C = new ArrayList<>();
            for(int j = 0; j < m; j++){
                if(p[j] == i+1){
                    C.add(y[j]);
                }
            }
            Collections.sort(C);
            for(int k = 0; k < C.size(); k++){
                for(int j = 0; j < m; j++){
                    if(C.get(k) == y[j]){
                        ans2[j] = k;
                    }
                }
            }
        }
        String[] Ans1 = new String[m];
        String[] Ans2 = new String[m];
        int[] len1 = new int[m];
        int[] len2 = new int[m];
        for(int i = 0; i < m; i++){
            Ans1[i] = String.valueOf(ans1[i]);
            Ans2[i] = String.valueOf(ans2[i]+1);
            len1[i] = Ans1.length;
            len2[i] = Ans2.length;
        }
        for(int i = 0; i < m; i++){
            while(len1[i] <= 7){
                Ans1[i] = "0" + Ans1[i];
                len1[i] ++;
            }
            while(len2[i] <= 7){
                Ans2[i] = "0" + Ans2[i];
                len2[i] ++;
            }
            System.out.println(Ans1[i] + Ans2[i]);
        }
    }
}
