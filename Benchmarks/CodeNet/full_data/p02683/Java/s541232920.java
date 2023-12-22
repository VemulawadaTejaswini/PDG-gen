import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();

        ArrayList<int[]> a = new ArrayList<>();
        int[] cost = new int[n];
        for(int i = 0; i < n; i++){
            cost[i] = sc.nextInt();
            int[] ai = new int[m];
            for(int j = 0; j < m; j++){
                ai[j] = sc.nextInt();
            }
            a.add(ai);
        }

        int out = -1;
        int[] bilis = new int[n];
        for(int i = 0; i < pow2n(n); i++){
            int c = 0;
            int[] sum = new int[m];
            for(int j = 0; j < n; j++){
                if(bilis[j] == 1){
                    c += cost[j];
                    for(int k = 0; k < m; k++){
                        sum[k] += a.get(j)[k];
                    }
                }
            }
            if(bigger(sum, x)){
                if(out == -1){
                    out = c;
                } else {
                    out = Math.min(out, c);
                }
            }
            bilis = gene(bilis);
        }

        System.out.println(out);
        sc.close();

        
    }
    static int[] gene(int[] bilis){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < bilis.length; i++) al.add(bilis[i]);
        if(al.contains(0)) {
            int i = al.lastIndexOf(0);
            bilis[i] += 1;
            for(int j = i + 1; j < al.size(); j++){
                bilis[j] = 0;
            }
        } 
        return bilis;
    }
    static int pow2n(int n){
        int out = 1;
        for(int i = 0; i < n; i++){
            out *= 2;
        }
        return out;
    }
    static boolean bigger(int[] ia, int x){
        boolean b = true;
        for(int i = 0; i < ia.length; i++){
            if(ia[i] < x) b = false; 
        }
        return b;
    }
}