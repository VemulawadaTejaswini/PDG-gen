import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main{
    private static final int[] queen = new int[8];
    private static final boolean[] lock = new boolean[8];
    public static void main(String[] Args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            final StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            final int r = Integer.parseInt(st.nextToken());
            final int c = Integer.parseInt(st.nextToken());
            queen[r] = c;
            lock[r] = true;
        }
        search(0);
        final char[] ans = new char[72];
        Arrays.fill(ans, '.');
        for(int i = 8; i<72; i += 9)
            ans[i] = '\n';
        for(int i = 0; i<8; i++)
            ans[i*9+queen[i]] = 'Q';
        System.out.print(ans);
    }
    private static boolean search(int r){
        if(r>=8) return true;
        if(lock[r]) return canPut(r, queen[r])&&search(r+1);
        for(int i = 0; i<8; i++){
            queen[r] = i;
            if(canPut(r, i)&&search(r+1)) return true;
        }
        return false;
    }
    private static boolean canPut(int r, int c){
        for(int i = 0; i<8; i++){
            if(i<r||(i>r&&lock[i])){
                if(c==queen[i]) return false;
                if(Math.abs(c-queen[i])==Math.abs(r-i)) return false;
            }
        }
        return true;
    }
}