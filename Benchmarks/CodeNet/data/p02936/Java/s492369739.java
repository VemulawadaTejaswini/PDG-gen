import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        
        int n_v = sc.nextInt();
        int queri_n = sc.nextInt();
        ArrayList<ArrayList<Integer>> plain_graph = new ArrayList<>(n_v);
        
        for(int i=0; i<n_v; i++){
            ArrayList<Integer> null_arr = new ArrayList<>(0);
            plain_graph.add(null_arr);
        }
        
        int a = -1, b = -1;
        for(int i=1; i<n_v; i++){
            a = sc.nextInt()-1;
            b = sc.nextInt()-1;
            plain_graph.get(a).add(b);
            plain_graph.get(b).add(a);
        }
        
        /*ArrayList<ArrayList<Integer>> null_arrX2 = new ArrayList<>(n_v);
        for(int i=0; i<n_v; i++){
            ArrayList<Integer> null_arr = new ArrayList<>(0);
            null_arrX2.add(null_arr);
        }*/
        
        ArrayList<ArrayList<Integer>> brunch_dt = know_brunch(plain_graph, -1, 0);
        /*for(int i=0; i<n_v; i++){
            System.out.print(i + ":");
            for(int j=0; j<brunch_dt.get(i).size(); j++){
                System.out.print(brunch_dt.get(i).get(j));
            }
            System.out.println();
        }*/
        boolean[] whthr_leaf = new boolean[n_v];
        for(int i=0; i<n_v; i++){
            if(brunch_dt.get(i).size() == 0) whthr_leaf[i] = true;
            else whthr_leaf[i] = false;
        }
        
        long[] counter = new long[n_v];
        for(int i=0; i<n_v; i++){
            counter[i] = 0;
        }
        
        int root_tmp = -1, addition = -1;
        for(int i=0; i<queri_n; i++){
            root_tmp = sc.nextInt()-1;
            addition = sc.nextInt();
            counter[root_tmp] += addition;
        }
        counter = add_all_by_part(brunch_dt, counter, 0, whthr_leaf);
        System.out.print(counter[0]);
        for(int i=1; i<n_v; i++){
            System.out.print(" " + counter[i]);
        }
        System.out.println();
    }
    
    static long[] add_all_by_part(ArrayList<ArrayList<Integer>> brunch_dt, long[] counter_former, int root_to_add , boolean[] leaf_dt){
        int tmp=-1;
        for(int i=0; i<brunch_dt.get(root_to_add).size(); i++){
            tmp = brunch_dt.get(root_to_add).get(i);
            counter_former[tmp] += counter_former[root_to_add];
            
            if(!leaf_dt[tmp]) counter_former = add_all_by_part(brunch_dt, counter_former, tmp, leaf_dt);
        }
        return counter_former;
    }
    
    static ArrayList<ArrayList<Integer>> know_brunch(ArrayList<ArrayList<Integer>> plain_graph, int its_root, int now_pos){
        
        int n_brunch = plain_graph.get(now_pos).size() -1, tmp = -1;
        
        for(int i=0; i<=n_brunch; i++){
            tmp = plain_graph.get(now_pos).get(i);
            if(tmp != its_root){
                plain_graph = know_brunch(plain_graph, now_pos, tmp);
            }else{ 
                plain_graph.get(now_pos).remove(i);
                i--;
                n_brunch--;
            }
        }
        
        return plain_graph;
    }
    
    /*
    static boolean[][] bfs(boolean[][] state, boolean[][] seen, int x, int y){
        int[] tmpltX = {1,-1,0,0};
        int[] tmpltY = {0,0,1,-1};
        int newX = -1, newY = -1;
        
        seen[y][x] = true;
        for(int i=0; i < 4; i++){
            newX = x+tmpltX[i];
            newY = y+tmpltY[i];
            if((newX >= 0) && (newY >= 0) && (newX < seen[0].length) && (newY < seen.length) && (!seen[newY][newX]) && state[newY][newX]) seen = bfs(state, seen, newX, newY);
        }
        return seen;
    }
    
    public static int binarySearchMax(int[] dt, int target){
        int left=-1, right=dt.length;
        int mid=-1;
        
        while((right-left)>1){
            mid = left + (right-left)/2;
            
            if(dt[mid] <= target){
                left=mid;
            }else{
                right=mid;
            }
        }
        return left+1;
    }*/
}
    class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}