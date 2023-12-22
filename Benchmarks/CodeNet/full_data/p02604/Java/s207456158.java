import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		long[][] nums = new long[N][3];
		for (int i = 0; i < N; i++) {
			nums[i] = new long[] {sc.nl(),sc.nl(),sc.nl()};
		}
		long[] ans = new long[N+1];
		Arrays.fill(ans, Long.MAX_VALUE);
		
		long[][] Xcost = new long[1<<N][N];
		long[][] Ycost = new long[1<<N][N];
		int[] Xroads = new int[1<<N];
		int[] Yroads = new int[1<<N];
		for (int b = 0; b < (1<<N); b++) {
			HashSet<Long> Xcovered = new HashSet<Long>();
			HashSet<Long> Ycovered = new HashSet<Long>();
			for (int i = 0; i < N; i++) {
				if ((b&(1<<i))==0) continue;
				Xcovered.add(nums[i][0]);
				Ycovered.add(nums[i][1]);
			}
			Xroads[b] = Xcovered.size();
			Yroads[b] = Ycovered.size();
			
			for (int j = 0; j < N; j++) {
				Xcost[b][j] = nums[j][2]*Math.abs(nums[j][0]);
				Ycost[b][j] = nums[j][2]*Math.abs(nums[j][1]);
				for (int i = 0; i < N; i++) {
					if ((b&(1<<i))==0) continue;
					Xcost[b][j] = Math.min(Xcost[b][j],nums[j][2]*Math.abs(nums[j][0]-nums[i][0]));
					Ycost[b][j] = Math.min(Ycost[b][j],nums[j][2]*Math.abs(nums[j][1]-nums[i][1]));
				}
			}
		}
		
		//build vertical roads through bit b
		for (int b = 0; b < (1<<N); b++) {
			int size = N-Integer.bitCount(b);
			int[] val = new int[size];
			int ind = 0;
			for (int i = 0; i < N; i++) {
				if ((b&(1<<i))>0) continue;
				val[ind] = (1<<i);
				ind++;
			}
			for (int y = 0; y < (1<<size); y++) {
				int bit = 0;
				for (int i = 0; i < size; i++) {
					if ((y&(1<<i))==0) continue;
					bit += val[i];
				}
				int uncovered = (1<<N)-1-b-bit;
				int roads = Xroads[b]+Yroads[bit];
				long cost = 0;
				for (int i = 0; i < N; i++) {
					if ((uncovered&(1<<i))==0) continue;
					cost += Math.min(Xcost[b][i],Ycost[bit][i]);
				}
				ans[roads] = Math.min(ans[roads],cost);
			}
		}
		
		for (int i = 1; i <= N; i++) {
			ans[i] = Math.min(ans[i], ans[i-1]);
		}
		for (long a: ans)
			pw.println(a);
		pw.close();
	}
	
    static class FastScanner { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastScanner() { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() { 
            while (st == null || !st.hasMoreElements()) { 
                try { 
                    st = new StringTokenizer(br.readLine());
                } catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        }
        
        int ni() { 
            return Integer.parseInt(next()); 
        }
  
        long nl() { 
            return Long.parseLong(next()); 
        } 
  
        double nd() { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() {
            String str = ""; 
            try { 
                str = br.readLine(); 
            } catch (IOException e) {
                e.printStackTrace(); 
            } 
            return str;
        }
    }
}