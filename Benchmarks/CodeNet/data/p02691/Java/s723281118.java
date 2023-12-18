import java.io.*;
import java.lang.*;
import java.util.*;
public class Main{  
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        StringTokenizer st=new StringTokenizer(br.readLine()," ");
        long[] arr=new long[N];
        for(int i=0;i<N;i++) arr[i]=Integer.parseInt(st.nextToken());
        HashMap<Long,Integer> map=new HashMap<Long,Integer>();
        int count=0;
        for(int i=0;i<N;i++){
            if(map.containsKey(i-arr[i])) count+=(map.get(i-arr[i]));
            if(map.containsKey(arr[i]+i)){
                int f=map.get(arr[i]+i);
                map.remove(arr[i]+i);
                map.put(arr[i]+i,f+1);
            }
            else map.put(arr[i]+i,1);
        }
        System.out.println(count);
    }
}
