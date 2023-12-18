import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        int b[] = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = Integer.parseInt(sc.next());
        }

        int a[][] = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = Integer.parseInt(sc.next());
            }
        }

        int sum = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < m; j++) {
                sum += a[i][j] * b[j];

                
            }
            if(sum + c > 0){
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}