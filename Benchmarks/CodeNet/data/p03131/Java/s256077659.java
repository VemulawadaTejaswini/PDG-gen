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
        list.add(((k-(a-1))/2));
            long a1=a;
            a+=2;
            k-=(a1-1);
            k-=2;
            long m = k%a;
            k-=m;
            if(k>=0) {
                long ans=b;
                ans += ((k / a) * b) + (m);
                list.add(ans);
            }
            else {
                long ans = k+1;
                list.add(ans);
            }
        System.out.println(Collections.max(list));
    }
}