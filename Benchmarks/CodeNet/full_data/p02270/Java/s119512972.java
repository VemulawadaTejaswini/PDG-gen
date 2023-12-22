
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author baito
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    static int n,k,total,max;
    static int[] w  ;
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        ContestScanner sc = new ContestScanner();
        n = sc.nextInt();
        k = sc.nextInt();
        w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
            total += w[i];
            max = Math.max(max, w[i]);
        }
        int answer = solve();
        System.out.println(answer);
    }
    public static int check(int max) {
        int sum = 0,i=0,j;
        for (j = 0; j < k;j++) {
            while(sum + w[i] <= max){
                sum += w[i];
                if(i == n - 1 )return n ;
                i++;
            }
            sum = 0;
            
        }
        return i;
    }
    public static int solve() {
        int first = max;
        int last = total  ,ans;
        while(- first + last > 1){
            int mid = (first + last)/2;
            ans = check(mid);
           // if(ans == n) return ans;
            if(ans >=  n ) last = mid ;
            else first = mid ;
        }
        if(check(first) == n)return first;
        return last;
    }

    
    
}

//????????????????????????
class ContestScanner {
    
    private final BufferedReader reader;
    private String[] line;
    private int idx;
    
    public ContestScanner() throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public ContestScanner(String filename) throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
    }
    //???????????? 

    public String readLine() throws Exception {
        return reader.readLine();
    }
    
    public String nextToken() throws IOException {
        if (line == null || line.length <= idx) {
            line = reader.readLine().trim().split(" ");
            idx = 0;
        }
        return line[idx++];
    }
    
    public long nextLong() throws IOException, NumberFormatException {
        return Long.parseLong(nextToken());
    }
    
    public int nextInt() throws NumberFormatException, IOException {
        return (int) nextLong();
    }
    
    public double nextDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(nextToken());
    }
}