import java.io.*;
import java.lang.*;
import java.util.*;

public class code
{
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                {
                    st = new StringTokenizer(br.readLine()); 
                }
                catch (IOException  e) 
                {
                    e.printStackTrace(); 
                }
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            {
                str = br.readLine(); 
            }
            catch (IOException e) 
            {
                e.printStackTrace(); 
            }
            return str; 
        } 
    }


	public static void main(String args[])throws IOException
	{
		FastReader scn = new FastReader();
		int x = scn.nextInt();
		System.out.println(1 - x);
	}

	public static void dfs(String[] grid, boolean[][] visited, int N, int M, int i, int j, int end_r, int end_c)
	{

		if(visited[end_r][end_c])
			return;

		visited[i][j] = true;
		if(Math.abs(i - end_r) + Math.abs(j - end_c) == 1)
			visited[end_r][end_c] = true;

		if(visited[end_r][end_c])
			return;

		if(isValid(i + 1, j, N, M) && !visited[i + 1][j] && grid[i + 1].charAt(j) == '.')
		{
			dfs(grid, visited, N, M, i + 1, j, end_r, end_c);
		}

		if(isValid(i - 1, j, N, M) && !visited[i - 1][j] && grid[i - 1].charAt(j) == '.')
		{
			dfs(grid, visited, N, M, i - 1, j, end_r, end_c);
		}

		if(isValid(i, j + 1, N, M) && !visited[i][j + 1] && grid[i].charAt(j + 1) == '.')
		{
			dfs(grid, visited, N, M, i, j + 1, end_r, end_c);
		}

		if(isValid(i, j - 1, N, M) && !visited[i][j - 1] && grid[i].charAt(j - 1) == '.')
		{
			dfs(grid, visited, N, M, i, j - 1, end_r, end_c);
		}

	}

	public static boolean isValid(int i, int j, int N, int M)
	{
		return ( i >= 0 && i < N) && ( j >= 0 && j < M);
	}
	
}