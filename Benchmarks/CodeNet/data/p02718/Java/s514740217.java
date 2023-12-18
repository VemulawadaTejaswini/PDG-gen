import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = 1;
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n];
        int x = 0,cnt=0,sum=0;
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
            sum+=a[i];
        }
        
        x = (int)Math.ceil(sum/(1.0*4*m));
        for(int i=0;i<n;i++){
            if(a[i]>=x) cnt++;
        }
        System.out.println(cnt>=m?"Yes":"No");
    }
}