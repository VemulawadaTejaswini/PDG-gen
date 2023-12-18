import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.regex.*;

public class Main {
    
    private static PrintWriter out;
    
    private static <T> void mprintln(T ... ar){
        for(T i: ar) out.print(i + " ");
        out.println();
    }
    
    public static void main(String[] args) throws FileNotFoundException{

        // Input from file
        // File inputFile = new File("JavaFile.txt");
        // File outputFile = new File("JavaOutputFile.txt");
        // FileReader fileReader = new FileReader(inputFile);
        // Here it ends

        MyScanner sc = new MyScanner();
        // MyScanner sc = new MyScanner(fileReader);

        out = new PrintWriter(new BufferedOutputStream(System.out)); // Output to console
        // out = new PrintWriter(new PrintStream(outputFile)); // Output to file

        getAns(sc);

        out.close(); 
    }
    
//  Global Variables  
    
    private static void getAns(MyScanner sc){
        int n = sc.ni(), m = sc.ni();
        ArrayList<Integer>[] list = new ArrayList[n + 1];
        for(int i = 1; i <= n; i++) list[i] = new ArrayList();
        
        while(m-- > 0){
            int u = sc.ni(), v = sc.ni();
            list[u].add(v);
        }
        
        int s = sc.ni(), t = sc.ni();
        
        int[][] dp = new int[3][n + 1];
        for(int i = 0; i < 3; i++) Arrays.fill(dp[i], Integer.MAX_VALUE);
        dp[0][s] = 0;
        
        Queue<int[]> queue = new LinkedList();
        queue.add(new int[]{0, s});
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int idx = (cur[0] + 1) % 3;
            
            for(Integer in: list[cur[1]]){
                if(dp[idx][in] > dp[cur[0]][cur[1]] + 1){
                    dp[idx][in] = dp[cur[0]][cur[1]] + 1;
                    queue.add(new int[]{idx, in});
                }
            }
        }
        
        out.println(dp[0][t] == Integer.MAX_VALUE? -1: dp[0][t] / 3);
    }
    
    static class MyScanner{
        BufferedReader br;
	StringTokenizer st;

	MyScanner(FileReader fileReader){
            br = new BufferedReader(fileReader);
	}

	MyScanner(){
            br = new BufferedReader(new InputStreamReader(System.in));
	}

	String nn(){
            while(st == null || !st.hasMoreElements()){
		try{
                    st = new StringTokenizer(br.readLine());
		}catch(IOException e){
                    e.printStackTrace();
		}
            }
            return st.nextToken();
	}
        
        String nextLine(){
            String ans = "";
            try {
                ans = br.readLine();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ans;
        }

	char nc(){
            return nn().charAt(0);
	}

	int ni(){
            return Integer.parseInt(nn());
	}

	long nl(){
            return Long.parseLong(nn());
	}

	double nd(){
            return Double.parseDouble(nn());
	}

	int[] niArr0(int n){
            int[] ar = new int[n];
            for(int i = 0; i < n; i++) ar[i] = ni();
            return ar;
	}

        int[] niArr1(int n){
            int[] ar = new int[n + 1];
            for(int i = 1; i <= n; i++) ar[i] = ni();
            return ar;
	}

        long[] nlArr0(int n){
            long[] ar = new long[n];
            for(int i = 0; i < n; i++) ar[i] = nl();
            return ar;
        }

        long[] nlArr1(int n){
            long[] ar = new long[n + 1];
            for(int i = 1; i <= n; i++) ar[i] = nl();
            return ar;
        }
    }
}