import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
class index {
        long curritems;
        long currweight;
    public index(){}
}
class Main {
    public static int items;
    public static long maxweight;
    public static Long rec(long[]wts,long[]val){
        Map<index,Integer> map = new HashMap<>();
        return rec(maxweight,wts,val,0,map);
    }
    public static long rec(long remwt,long[]wts,long[]val,int pos,Map map){
        if(pos==items||remwt<=0){
            return 0;
        }
        index key = new index();
        key.curritems=pos;
        key.currweight=remwt;
        long branchmax;
        if(map.containsKey(key))
            return (Long)map.get(key);
        else {

            if (remwt < wts[pos])
                branchmax =rec(remwt, wts, val, pos + 1, map);
            else
                branchmax= Long.max(val[pos]+rec(remwt - wts[pos], wts, val, pos + 1, map), rec(remwt, wts, val, pos + 1, map));
            map.put(key,branchmax);
        }
        return branchmax;
    }
    public static void main(String[] args)throws IOException {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        long [] val = new long[number];
        long [] wts = new long[number];
        maxweight= Long.parseLong(st.nextToken());
        for(int i = 0;i <number;i++){
            st=new StringTokenizer(br.readLine());
            wts[i]=Long.parseLong(st.nextToken());
            val[i]=Long.parseLong(st.nextToken());
        }
        items=number;
        out.println(rec(wts,val));
        out.flush();
    }
}