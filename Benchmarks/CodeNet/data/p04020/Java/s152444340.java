import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        int n=Integer.parseInt(f.readLine());
        long[]arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=Long.parseLong(f.readLine());
        }
        long ans=0;
        for(int i=0;i<n;i++){
            if(i!=0 && arr[i]!=0)arr[i]+=arr[i-1];
            ans+=arr[i]/2;
            arr[i]%=2;
        }
        System.out.print(ans);
        f.close();
        out.close();
    }
}
class pair implements Comparable <pair>{
    int num;
    int idx;

    public int compareTo(pair other){
        return num- other.num;
    }


    pair(int a, int b)
    {
        num=a;
        idx=b;
    }
}
