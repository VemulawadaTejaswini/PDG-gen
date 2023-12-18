import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        long[] a=new long[n];
        long sum=0;
        for(int i=0;i<n;i++){ a[i]=Long.parseLong(st.nextToken()); sum+=a[i]; }
        if(sum%((n*(n+1))/2)!=0){
            System.out.println("NO");
            System.exit(0);
        }
        long times=sum/((n*(n+1))/2);
        for(int i=0;i<n;i++){
            if((a[(i+1)%n]-a[i]>times)||(times-(a[(i+1)%n]-a[i]))%n!=0){
                System.out.println("NO");
                System.exit(0);
            }
        }System.out.println("YES");
    }
}
