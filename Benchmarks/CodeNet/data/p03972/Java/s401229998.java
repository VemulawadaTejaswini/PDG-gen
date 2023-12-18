import java.util.*;
import java.io.*;
public class Main{
    static int determine(long p[],int a){
        int low = 1;
        int high = p.length;
        while(low < high){
            int mid = (low + high)/2;
            if(p[mid] <= a)low = mid + 1;
            else high = mid;
        }
        return low - 1;
    }
    public static void main(String [] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        long ans = 0;
        long p[] = new long[w + 1];
        p[0] = 0;
        for(int i = 1;i <= w;i++){
            int a = Integer.parseInt(br.readLine());
            ans += a*1L*(h + 1);
            p[i] = a;
        }
        Arrays.sort(p);
        long var = 0;
        long temp[] = p.clone();
        for(int i = 1;i < p.length;i++)
            p[i] += p[i - 1];
        for(int i = 1;i <= h;i++){
            int a = Integer.parseInt(br.readLine());
            ans += a*1L*(w + 1);
            int pos = determine(temp,a);
            var += a*pos + p[p.length - 1] - p[pos];
            //System.out.println(var + " " + pos + " " + i);
        }
        System.out.println(ans - var);
    }
}