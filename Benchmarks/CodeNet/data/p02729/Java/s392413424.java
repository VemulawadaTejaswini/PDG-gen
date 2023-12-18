import java.util.*;
import java.io.*;
class Solution {
    public static void main(String[] args) throws IOException{
    	// Solution sol = new Solution();
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st= new StringTokenizer(br.readLine());
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	System.out.println((N*(N-1)+M*(M-1))/2);
    }
}