import java.io.*;
import java.util.*;


public class Main {
    static ArrayList<Integer>[] graph;
    static TreeMap<Long,Long> valTime = new TreeMap<>();
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] buf = reader.readLine().split(" ");
        int n = Integer.parseInt(buf[0]), m = Integer.parseInt(buf[1]);
        buf = reader.readLine().split(" ");
        for(String w:buf){
            long cur = Long.parseLong(w);
            putHelp(cur,1);
        }
        for(int i=0;i<m;i++){
            buf = reader.readLine().split(" ");
            long b = Long.parseLong(buf[0]), c = Long.parseLong(buf[1]);
            putHelp(c,b);
        }
        long cnt = 0,ans = 0;
        while(cnt<n){
            Map.Entry<Long,Long> cur = valTime.pollLastEntry();
            long val = cur.getKey(), time = cur.getValue();
            long toadd = Math.min(time,n-cnt);
            ans += toadd*val;
            cnt += toadd;
        }
        System.out.println(ans);


    }
    static void putHelp(long val, long time){
        if(!valTime.containsKey(val)) valTime.put(val,time);
        else valTime.put(val,valTime.get(val)+time);
    }
}

