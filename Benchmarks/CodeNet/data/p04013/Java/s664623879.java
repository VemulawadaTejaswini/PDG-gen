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
        HashMap<Integer,Integer>map[] = new HashMap[30];
        int array[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i < n;i++)
            array[i] = Integer.parseInt(st.nextToken());
        for(int i = 0;i <= 29;i++)
            map[i] = new HashMap<>();
        for(int mask = 0;mask < (1 << n/2);mask++){
            int ans = 0;
            int bits = Integer.bitCount(mask);
            for(int j = 0;j < n/2;j++){
                if((mask & (1 << j)) == 0)continue;
                ans += array[j];
            }
            if(map[bits].containsKey(ans))
                map[bits].put(ans,map[bits].get(ans) + 1);
            else map[bits].put(ans,1);
        }
        int temp = n/2;
        long cnt = 0;
        if((n & 1) == 1)temp += 1;
        for(int mask = 0;mask < (1 << temp);mask++){
            int ans = 0;
            int bits = Integer.bitCount(mask);
            for(int j = 0;j < temp;j++){
                if((mask & (1 << j)) == 0)continue;
                ans += array[n/2 + j];
            }
            for(int i = 0;i <= 27;i++){
                int tot = a*(bits + i) - ans;
                if(tot < 0)continue;
                if(!map[i].containsKey(tot))continue;
                cnt += map[i].get(tot);
                //System.out.println(tot + " " + cnt + " " + ans + " " + i + " " + bits);
            }
        }
        System.out.print(cnt - 1);
    }
}
