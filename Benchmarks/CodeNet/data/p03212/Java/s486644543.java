import java.io.*;
import java.util.*;
public class Main{
    //static long N;
    public static void main(String[] args) throws IOException{
        Reader r = new Reader();        
        //N = r.l();
        //print(dfs(0, false));     
        int N = r.i();
        print(dfs2(N));
    }
    /*static int dfs(long i, boolean is753){
        if(N < i){
            return 0;
        }
        int ret = 0;
        if(is753){
            ret++;
        }
        else{
            if(is753(i)){
                ret++;      
                is753 = true;
            }
        }
        int[] n753 = {7, 5, 3};
        for(int j : n753){
            ret += dfs(i*10+j, is753);
        }
        return ret;        
    }
    */
    static boolean is753(long i){
        boolean is3 = false,
                is5 = false,
                is7 = false;
        while(0 < i){
            int j = (int)(i%10);
            switch(j){
                case 7:
                    is7 = true;
                    break;
                case 5:
                    is5 = true;
                    break;
                case 3:
                    is3 = true;
                    break;
                default:
            }
            if(is3 && is5 && is7){
                return true;
            }         
            i /= 10;
        }
        return false;
    }
    
    static int dfs2(int N){
        ArrayList<long[]> A = new ArrayList<>();
        A.add(new long[]{0, 0});
        int ret = 0;
        while(A.size() > 0){
            ArrayList<long[]> B = new ArrayList<>();
            Iterator<long[]> iterator = A.iterator();
            while(iterator.hasNext()){
                long[] a = iterator.next();
                iterator.remove();
                long i = a[0];
                if(N < i) continue;
                if(a[1] == 1) ret++;
                else{
                    if(is753(i)){
                        ret++;      
                        a[1] = 1;
                    }
                }
                int[] n753 = {7, 5, 3};
                for(int j : n753){
                    B.add(new long[]{i*10+j, a[1]});
                }
            }
            A.addAll(B);
            B.clear();
        }
        return ret;
    }
    static void print(Object o){
        System.out.println(o.toString());
    }
    static void print(boolean b, String s1, String s2){
        System.out.println(b ? s1 : s2);
    }
    static int max(int[] ii){
        int max = ii[0];
        for(int i : ii) if(max < i) max = i;
        return max;
    }
    static int min(int[] ii){
        int min = ii[0];
        for(int i : ii) if(i < min) min = i;
        return min;
    }
    static long max(long[] ll){
        long max = ll[0];
        for(long l : ll) if(max < l) max = l;     
        return max;
    }
    static long min(long[] ll){
        long min = ll[0];
        for(long l : ll) if(l < min) min = l;
        return min;
    }
    static double max(double[] dd){
        double max = dd[0];
        for(double d : dd) if(max < d) max = d;
        return max;
    }
    static double min(double[] dd){
        double min = dd[0];
        for(double d : dd) if(d < min) min = d;
        return min;
    }
    static class Reader extends BufferedReader{
        Reader(){
            super(new InputStreamReader(System.in));
        }
        String s() throws IOException{
            return readLine();
        }
        String[] ss() throws IOException{
            return readLine().split(" ");
        }
        int i() throws IOException{
            return Integer.parseInt(readLine());
        }
        int[] ii() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            int[] ii = new int[size];
            for(int j = 0; j < size; j++) ii[j] = Integer.parseInt(ss[j]);
            return ii;
        }
        int[] ii(int N) throws IOException{
            int[] ii = new int[N];
            for(int j = 0; j < N; j++) ii[j] = i();
            return ii;
        }
        long l() throws IOException{
            return Long.parseLong(readLine());
        }
        long[] ll() throws IOException{
            String[] ss = ss();
            int size = ss.length;
            long[] ll = new long[size];
            for(int j = 0; j < size; j++) ll[j] = Long.parseLong(ss[j]);            
            return ll;
        }
        long[] ll(int N) throws IOException{
            long[] ll = new long[N];
            for(int j = 0; j < N; j++) ll[j] = i();            
            return ll;
        }
    }
}