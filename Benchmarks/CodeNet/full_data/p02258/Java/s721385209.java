import java.io.*;
import java.util.*;

class Main {

    static int[] a;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        a=new int[n];
        for(int i=0;i<n;i++){ a[i]=Integer.parseInt(br.readLine()); }
        int mini=1000000000;
        int max=-1000000000;
        int max_index=1;
        for(int i=0;i<n;i++){
            if(mini>a[i]){ mini=a[i]; }
            if(i<n-1 && max<a[i+1]-mini){ max=a[i+1]-mini; }
        }System.out.println(max);
    }
    
}