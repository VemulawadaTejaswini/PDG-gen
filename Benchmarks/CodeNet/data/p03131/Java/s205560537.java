import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        String[]s=bufferedReader.readLine().split( " ");
        long k=Long.parseLong(s[0]),a=Long.parseLong(s[1]),b=Long.parseLong(s[2]);
        List<Long>list=new ArrayList<>();
        list.add(k+1);
        k-=((a-1)+2);
        long mod = k%(a+2);
        k-=mod;
        if(k>=0)
        {
            if(b>a) {
                long ans = b;
                ans += ((k / (a + 2)) * b) + mod;
                ans -= (k/(a+2))*a;
                list.add(ans);
            }
        }
        System.out.println(Collections.max(list));
    }
}