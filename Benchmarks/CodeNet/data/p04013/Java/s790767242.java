/**
 * Created by abhishek on 8/22/2016.
 */
import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int matrix[][] = new int[30][2505];
        int array[] = new int[n];
        st = new StringTokenizer(br.readLine());
        int temp = n/2 + 1;
        for(int i = 0;i < n;i++)
            array[i] = Integer.parseInt(st.nextToken());
        for(int mask = 0;mask < (1 << temp);mask++){
            int ans = 0;
            int bits = 0;
            for(int j = 0;j < temp;j++){
                if((mask & (1 << j)) == 0)continue;
                ++bits;
                ans += array[j];
            }
            matrix[bits][ans]++;
        }
        long cnt = 0;
        int left = n - temp;
        for(int mask = 0;mask < (1 << left);mask++){
            int ans = 0;
            int bits = 0;
            for(int j = 0;j < left;j++){
                if((mask & (1 << j)) == 0)continue;
                ++bits;
                ans += array[temp + j];
            }
            for(int i = 0;i <= temp;i++){
                int tot = a*(bits + i) - ans;
                if(tot < 0)continue;
                cnt += matrix[i][tot];
                //System.out.println(tot + " " + cnt + " " + ans + " " + i + " " + bits);
            }
        }
        System.out.print(cnt - 1);
    }
}
