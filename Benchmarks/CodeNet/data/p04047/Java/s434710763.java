import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine());
        int[] a=new int[2*n];
        for(int i=0;i<2*n;i++){ a[i]=Integer.parseInt(st.nextToken()); }
        Arrays.parallelSort(a);
        int sum=0;
        for(int i=0;i<2*n;i+=2){ sum+=Math.min(a[i],a[i+1]); }
        System.out.println(sum);
    }
}