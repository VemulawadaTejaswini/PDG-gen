import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new PrintStream(System.out));
        int n=Integer.parseInt(f.readLine());
        long[]arr=new long[n];
        StringTokenizer st=new StringTokenizer(f.readLine());
        HashMap<Long,Integer>hs=new HashMap<>();

        for(int i=0;i<n;i++){
            arr[i]=Long.parseLong(st.nextToken());
            if(!hs.containsKey(arr[i])){
                hs.put(arr[i],1);
            }
            else
            hs.put(arr[i],hs.get(arr[i])+1);
        }
        Arrays.sort(arr);
        long ans=0;
        for(int i=n-1;i>=0;i--){
            if(!hs.containsKey(arr[i]))continue;
            if(hs.get(arr[i])==1)
            hs.remove(arr[i]);
            else hs.put(arr[i],hs.get(arr[i])-1);
            long j=1;
            while(j<=arr[i]){

                j*=2;
            }
            if(hs.containsKey(j-arr[i])){
                ans++;
                if(hs.get(j-arr[i])==1)
                    hs.remove(j-arr[i]);
                else hs.put(j-arr[i],hs.get(j-arr[i])-1);
            }

        }
        System.out.print(ans);
        f.close();
        out.close();
    }
}