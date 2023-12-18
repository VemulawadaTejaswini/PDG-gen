
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] juge = new int[n][m+1];
        String[] c = new String[n];
        int cost = 10000000;
        for(int i=0;i<n;i++){
            for(int j=0;j<=m;j++){
                juge[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            c[i] = String.valueOf(i);
        }
        List<String> list = new ArrayList<>();
        sc.close();
        for (int i = 0; i < 1 << c.length; i++) {
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < c.length; j++) {
                if ((i >> j & 1) == 1) {
                    sb.append(c[j]);
                }
            }
            list.add(sb.toString());
        }
        int[] aa = new int[m+1];
        for (int i = 0; i < n; i++) {
            for(int k=0;k<m+1;k++){
                aa[k] = aa[k] + juge[i][k];
            }
        }
        for(int j=1;j<aa.length;j++){
            if(aa[j]<x){
                System.out.println(-1);
                return;
            }
        }
        
        for (int i = 1; i < list.size(); i++) {
            boolean flag = true;
//            System.out.println(i + ":" + list.get(i));
            int[] sum = new int[m+1];
            StringBuffer sb = new StringBuffer(list.get(i));
            for(int j=0;j<sb.length();j++){
                int array = Integer.parseInt(sb.substring(j, j+1));
//                System.out.println(array);
                for(int k=0;k<m+1;k++){
                    sum[k] = sum[k] + juge[array][k];
                }
            }
            for(int j=1;j<sum.length;j++){
                if(sum[j]<x){
                    flag = false;
                }
            }
            if(flag && cost>sum[0]){
                cost = sum[0];
            }
        }
        System.out.println(cost);
    }
}
