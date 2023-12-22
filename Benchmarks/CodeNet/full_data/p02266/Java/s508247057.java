import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static final int BIG_NUM = 2000000000;
    public static final int MOD = 1000000007;
    
    public static void main(String[] args) {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> LOC = new ArrayDeque<>();
        Deque<Info> POOL   = new ArrayDeque<>();
    
        int tmp_S, tmp_start, tmp_end, sum = 0;
        
        try {
            char array[] = br.readLine().toCharArray();
            
            for(int i = 0; i < array.length; i++) {
                if(array[i] == '\\') {
                    LOC.addFirst(i);
                }else if(array[i] == '/') {
                    if(LOC.isEmpty()) continue;
                    
                    tmp_start = LOC.getFirst();
                    LOC.removeFirst();
                    tmp_end = i;
                    
                    tmp_S = tmp_end - tmp_start;
                    sum += tmp_S;
                    
                    while(!(POOL.isEmpty()) && POOL.getFirst().getStart() > tmp_start && POOL.getFirst().getEnd() < tmp_end) {
                        tmp_S += POOL.getFirst().getS();
                        POOL.removeFirst();
                    }
                    
                    POOL.addFirst(new Info(tmp_start, tmp_end, tmp_S));
                }else {
                    //Do nothing
                }
            }
            
            System.out.println(sum);
            
            StringBuilder ans = new StringBuilder();
            ans.append(Integer.toString(POOL.size()));
            
            while(!POOL.isEmpty()) {
                ans.append(" ").append(Integer.toString(POOL.getLast().getS()));
                POOL.removeLast();
            }
            
            System.out.println(ans.toString());
        }catch(NumberFormatException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
}  

class Info {
    private int start;
    private int end;
    private int S;
    
    Info(int start, int end, int S) {
        this.start = start;
        this.end = end;
        this.S = S;
    }
    
    public int getStart() {
        return start;
    }
    public void setStart(int start) {
        this.start = start;
    }
    
    public int getEnd() {
        return end;
    }
    public void setEnd(int end) {
        this.end = end;
    } 
    
    public int getS() {
        return S;
    }
    public void setS(int S) {
        this.S = S;
    }
}
