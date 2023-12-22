import java.io.*;
import java.util.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long[] array=new long[n];
        StringTokenizer st=new StringTokenizer(br.readLine());
        long sum=0;
        for(int i=0;i<n;i++){ array[i]=Long.parseLong(st.nextToken()); sum+=array[i]; }
        Arrays.sort(array);
        System.out.println(array[0]+" "+array[n-1]+" "+sum);
    }
}