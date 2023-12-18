import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        for(int i = 0; i < n; ++i){
            arr[i] = Long.parseLong(br.readLine());
        }
        if(n==1){
            System.out.println(arr[0]);
            return;
        }
        int twos = 0;
        int minustwos = 0;
        int ones = 0;
        int minusones = 0;
        Arrays.sort(arr);
        long ans = 0;
        if(n%2==1){
            // case 1 end downs
            minusones = 2;
            twos = n/2;
            minustwos = (n-2)/2;
            long res = 0;
            int start = 0;
            while(minustwos-- > 0)
                res += -2*arr[start++];
            while(minusones-- > 0)
                res += -1*arr[start++];
            while(twos-- > 0)
                res += 2*arr[start++];
            ans = Math.max(ans, res);
            
            // case 1 end ups
            ones = 2;
            minustwos = n/2;
            twos = (n-2)/2;
            res = 0;
            start = 0;
            while(minustwos-- > 0)
                res += -2*arr[start++];
            while(ones-- > 0)
                res += arr[start++];
            while(twos-- > 0)
                res += 2*arr[start++];
            ans = Math.max(ans, res);
        }
        else {
            ones = 1;
            minusones = 1;
            twos = (n-2)/2;
            minustwos = (n-2)/2;
            // TODO : assin and calc
            long res = 0;
            int start = 0;
            while(minustwos-- > 0)
                res += -2*arr[start++];
            while(minusones-- > 0)
                res += -1*arr[start++];
            while(ones-- > 0)
                res += arr[start++];
            while(twos-- > 0)
                res += 2*arr[start++];
            ans = Math.max(ans, res);
        }
        System.out.println(ans);
    }
}