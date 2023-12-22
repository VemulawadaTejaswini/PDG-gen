import java.io.*;
import java.util.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        String s1[] = br.readLine().trim().split(" ");
        String s2[] = br.readLine().trim().split(" ");
        String s3[] = br.readLine().trim().split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        int k = Integer.parseInt(s1[2]);
        int a[] = new int[n];
        int b[] = new int[m];
        for(int i=0;i<n;i++) a[i] = Integer.parseInt(s2[i]);
        for(int i=0;i<m;i++) b[i] = Integer.parseInt(s3[i]);
        long sum=0;
        int p1=0,p2=0;
        while(p1<n && p2<m) {
            if(a[p1] < b[p2]) {
                if(sum+a[p1]>k)break;
                sum+=a[p1];
                ++p1;
            } else {
                if(sum+b[p2]>k)break;
                sum+=b[p2];
                ++p2;
                break;
            }
        }
        while(p1<n && sum+a[p1]<=k) {sum+=a[p1];++p1;}
        while(p2<m && sum+b[p2]<=k) {sum+=b[p2];++p2;}
        out.println(p1+p2);
        out.flush();
    }
}