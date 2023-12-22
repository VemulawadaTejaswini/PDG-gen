
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int min = 999999999;
        int[][] book = new int[n][m+1];
        int[] us = new int[m];
        boolean[] buy = new boolean[n];

        for(int i=0;i<n;i++){
            buy[i] = false;
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m+1;j++){
                book[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<Math.pow(2,n)-1;i++){
            plus(buy,buy.length-1);
            int sum = 0;
            for(int j=0;j<m;j++){
                us[j] = 0;
            }
            for(int j=0;j<n;j++){
                if(buy[j]){
                    sum += book[j][0];
                    for(int k=0;k<m;k++){
                        us[k] += book[j][k+1];
                    }
                }
            }

            boolean ok = true;
            for(int j=0;j<m;j++){
                if(us[j]<x){
                    ok = false;
                    break;
                }
            }
            if(ok && sum<min){
                min = sum;
            }

        }
        if(min!=999999999){
            System.out.println(min);
        } else{
            System.out.println(-1);
        }
    }

    static boolean[] plus(boolean[] b,int idx){
        if(idx == -1)
            return b;
        if(b[idx]){
            b[idx] = false;
            plus(b,idx-1);
        }else {
            b[idx] = true;
        }
        return b;
    }
}
