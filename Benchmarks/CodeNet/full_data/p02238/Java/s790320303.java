import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner();
        
        
        int n_v = sc.nextInt();
        //int queri_n = sc.nextInt();
        ArrayList<ArrayList<Integer>> plain_graph = new ArrayList<>(n_v);
        
        for(int i=0; i<n_v; i++){
            ArrayList<Integer> null_arr = new ArrayList<>(0);
            plain_graph.add(null_arr);
        }
        
        int a = -1, n_tmp = -1;
        for(int i=0; i<n_v; i++){
            n_tmp = sc.nextInt();
            n_tmp = sc.nextInt();
            for(int j=0; j<n_tmp; j++){
                a = sc.nextInt()-1;
                plain_graph.get(i).add(a);
            }
        }
        
        int t=1;
        int[] ts_in = new int[n_v];
        int[] ts_out = new int[n_v];
        for(int i=0; i<n_v; i++){
            ts_in[i] = -1;
            ts_out[i] = -1;
        }
        
        ArrayDeque<Integer> todo = new ArrayDeque<>();
        
        int deal_with=0;
        for(int i=0; i<n_v; i++){
            if(ts_in[i] < 0){
                todo.add(i);
                while(todo.size() > 0){
                    deal_with = todo.getLast();
                    //System.out.println(t+":p"+(deal_with+1));
                    //disp_que(todo.clone());
                    if(ts_in[deal_with] < 0){
                        ts_in[deal_with] = t;
                        t++;
                        for(int j=plain_graph.get(deal_with).size()-1; j>=0; j--){
                            if(ts_in[plain_graph.get(deal_with).get(j)] < 0) todo.add(plain_graph.get(deal_with).get(j));
                        }
                    }else if(ts_out[deal_with] < 0){
                        ts_out[deal_with] =t;
                        t++;
                        todo.removeLast();
                    }else{
                        todo.removeLast();
                    }
                }
            }
        }
        for(int i=0; i<n_v; i++){
            System.out.println((i+1) + " " + ts_in[i] + " " + ts_out[i]);
        }
        
        
        /*ArrayList<ArrayList<Integer>> null_arrX2 = new ArrayList<>(n_v);
        for(int i=0; i<n_v; i++){
            ArrayList<Integer> null_arr = new ArrayList<>(0);
            null_arrX2.add(null_arr);
        }*/
        
        //ArrayList<ArrayList<Integer>> brunch_dt = know_brunch(plain_graph, -1, 0);
        /*for(int i=0; i<n_v; i++){
            System.out.print(i + ":");
            for(int j=0; j<brunch_dt.get(i).size(); j++){
                System.out.print(brunch_dt.get(i).get(j));
            }
            System.out.println();
        }*/
        /*boolean[] whthr_leaf = new boolean[n_v];
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
        System.out.println();*/
    }
    
    static void disp_que(ArrayDeque<Integer> dt){
        int a=0;
        while(dt.size()>0){
            a=dt.removeFirst()+1;
            System.out.print(a);
        }
        System.out.println();
    }
    
    static void show_b2d_array(boolean[][] dt, int lit_x, int lit_y){
    	for(int i=0; i<dt[0].length; i++){
    		for(int j=0; j<dt.length; j++){
    		    if((i==lit_y) && (j==lit_x)) System.out.print("X");
    		    else if(dt[j][i]) System.out.print("O");
    		    else System.out.print(".");
    		}
    		System.out.println();
    	}
    	System.out.println();
    }
    
    /*static long[] add_all_by_part(ArrayList<ArrayList<Integer>> brunch_dt, long[] counter_former, int root_to_add , boolean[] leaf_dt){
        int tmp=-1;
        for(int i=0; i<brunch_dt.get(root_to_add).size(); i++){
            tmp = brunch_dt.get(root_to_add).get(i);
            counter_former[tmp] += counter_former[root_to_add];
            
            if(!leaf_dt[tmp]) counter_former = add_all_by_part(brunch_dt, counter_former, tmp, leaf_dt);
        }
        return counter_former;
    }*/
    
    /*static ArrayList<ArrayList<Integer>> know_brunch(ArrayList<ArrayList<Integer>> plain_graph, int its_root, int now_pos){
        
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
    }*/
    
    
    static int dfs2(boolean[][] state, int x, int y, int depth){
        int[] tmpltX = {1,-1,0,0};
        int[] tmpltY = {0,0,1,-1};
        int newX = -1, newY = -1;
        
        //System.out.println(x + "," + y + " d:" + (depth+1));
        //show_b2d_array(state, x, y);
        
        state[x][y] = false;
        depth++;
        
        int maxDunder_this_brunch = depth, tmpD=0;
        for(int i=0; i < 4; i++){
            newX = x+tmpltX[i];
            newY = y+tmpltY[i];
            if((newX >= 0) && (newY >= 0) && (newX < state.length) && (newY < state[0].length) && state[newX][newY]) tmpD = dfs2(state, newX, newY, depth);
            if(tmpD > maxDunder_this_brunch) maxDunder_this_brunch=tmpD;
        }
        state[x][y] = true;
        return maxDunder_this_brunch;
    }
    
    /*public static int binarySearchMax(int[] dt, int target){
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
        return left;  //target以下の最大のaddress
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
