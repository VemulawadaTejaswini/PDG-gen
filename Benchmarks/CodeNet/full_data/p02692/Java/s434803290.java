import java.io.*;
import java.util.*;
import java.math.*;
import java.awt.Point;
 
public class Main {
	//static final long MOD = 998244353L;
	//static final long INF = 1000000000000000007L;
	static final long MOD = 1000000007L;
	static final int INF = 1000000007;
	
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		int[] nums = new int[]{sc.ni(),sc.ni(),sc.ni()};
		int[][] list = new int[N][2];
		for (int i = 0; i < N; i++) {
			String s = sc.next();
			int n1 = s.charAt(0)-'A';
			int n2 = s.charAt(1)-'A';
			list[i] = new int[]{n1,n2};
		}
		if (nums[0]+nums[1]+nums[2] >= 3) {
			if (nums[list[0][0]] == 0 && nums[list[0][1]] == 0) {
				pw.println("No");
			} else {
				ArrayList<Integer> ans = new ArrayList<Integer>();
				for (int[] move: list) {
					if (nums[move[0]]  < nums[move[1]]) {
						nums[move[0]] += 1;
						nums[move[1]] -= 1;
						ans.add(move[0]);
					} else {
						nums[move[0]] -= 1;
						nums[move[1]] += 1;
						ans.add(move[1]);
					}
				}
				
				pw.println("Yes");
				for (int a: ans)
					pw.println((char)(a+'A'));
			}
		} else {
			int S = nums[0]+nums[1]+nums[2];
			boolean[][][][] dp = new boolean[N+1][4][4][4];
			char[][][][] prev = new char[N+1][4][4][4];
			dp[0][nums[0]][nums[1]][nums[2]] = true;
			for (int i = 1; i <= N; i++) {
				int[] move = list[i-1];
				for (int a = 0; a <= S; a++) {
					for (int b = 0; b <= S-a; b++) {
						for (int c = 0; c <= S-a-b; c++) {
							if (move[0] == 0 && move[1] == 1) {
								//AB
								if (a > 0 && dp[i-1][a-1][b+1][c]) {
									dp[i][a][b][c] = true;
									prev[i][a][b][c] = 'A';
								} else if (b > 0 && dp[i-1][a+1][b-1][c]) {
									dp[i][a][b][c] = true;
									prev[i][a][b][c] = 'B';
								}
							} else if (move[0] == 0 && move[1] == 2) {
								//AC
								if (a > 0 && dp[i-1][a-1][b][c+1]) {
									dp[i][a][b][c] = true;
									prev[i][a][b][c] = 'A';
								} else if (c > 0 && dp[i-1][a+1][b][c-1]) {
									dp[i][a][b][c] = true;
									prev[i][a][b][c] = 'C';
								}
							} else {
								//AC
								if (b > 0 && dp[i-1][a][b-1][c+1]) {
									dp[i][a][b][c] = true;
									prev[i][a][b][c] = 'B';
								} else if (c > 0 && dp[i-1][a][b+1][c-1]) {
									dp[i][a][b][c] = true;
									prev[i][a][b][c] = 'C';
								}
							}
						}
					}
				}
			}
			char[] ans = new char[N];
			
			int[] vals = new int[]{-1,-1,-1};
			loop:
			for (int a = 0; a <= S; a++) {
				for (int b = 0; b <= S-a; b++) {
					for (int c = 0; c <= S-a-b; c++) {
						if (dp[N][a][b][c]) {
							vals = new int[]{a,b,c};
							break loop;
						}
					}
				}
			}
			if (vals[0] >= 0) {
				for (int i = N-1; i >= 0; i--) {
					char p = prev[i+1][vals[0]][vals[1]][vals[2]];
					ans[i] = p;
					if (list[i][0]==(p-'A')) {
						vals[list[i][0]] -= 1;
						vals[list[i][1]] += 1;
					} else {
						vals[list[i][0]] += 1;
						vals[list[i][1]] -= 1;
					}
				}
				pw.println("Yes");
				for (char a: ans)
					pw.println(a);
			} else {
				pw.println("No");
			}
		}
		pw.close();
	}
 
	public static long dist(long[] p1, long[] p2) {
		return (Math.abs(p2[0]-p1[0])+Math.abs(p2[1]-p1[1]));
	}
	
	//Find the GCD of two numbers
	public static long gcd(long a, long b) {
		if (a < b) return gcd(b,a);
		if (b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	//Fast exponentiation (x^y mod m)
	public static long power(long x, long y, long m) { 
		if (y < 0) return 0L;
		long ans = 1;
		x %= m;
		while (y > 0) { 
			if(y % 2 == 1) 
				ans = (ans * x) % m; 
			y /= 2;  
			x = (x * x) % m;
		} 
		return ans; 
	}
	
	public static int[] shuffle(int[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
	public static long[] shuffle(long[] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
	public static int[][] shuffle(int[][] array) {
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		return array;
	}
	
    public static int[][] sort(int[][] array) {
    	//Sort an array (immune to quicksort TLE)
 
		Arrays.sort(array, new Comparator<int[]>() {
			  @Override
        	  public int compare(int[] a, int[] b) {
				  return a[0]-b[0]; //ascending order
	          }
		});
		return array;
	}
    
    public static long[][] sort(long[][] array) {
    	//Sort an array (immune to quicksort TLE)
		Random rgen = new Random();
		for (int i = 0; i < array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    long[] temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
		Arrays.sort(array, new Comparator<long[]>() {
			  @Override
        	  public int compare(long[] a, long[] b) {
				  if (a[0] < b[0])
					  return -1;
				  else if (a[0] > b[0])
					  return 1;
				  else
					  return 0;
	          }
		});
		return array;
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