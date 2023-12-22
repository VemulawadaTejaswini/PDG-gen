import java.io.*;
import java.util.*;

class Main {
 	public static void main(String args[]) throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	int N = Integer.parseInt(br.readLine());
      	StringTokenizer st = new StringTokenizer(br.readLine());
      	long[] arr = new long[N];
      	long sum = 0;
      	long ans = 0;
      	for(int i=0;i<N;i++) {
          	sum -= arr[i];
         	arr[i] = Long.parseLong(st.nextToken()); 
          	sum += arr[i];
        }
      	for(int i=0;i<N;i++) {
         	 ans += (sum*arr[i]);
          	 ans /= 1000000007;
        }
      	System.out.println(ans);
    }
}