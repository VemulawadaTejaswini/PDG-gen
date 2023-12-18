import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{  
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[] arr=new int[N+1];
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        for(int i=2;i<=N;i++) {
            int n=Integer.parseInt(st.nextToken());
            arr[n]++;
        }
        StringBuffer sb=new StringBuffer();
        for(int i=1;i<=N;i++) sb.append(arr[i]+"\n");
        System.out.print(sb);
    }
}
