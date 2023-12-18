import java.io.*;
import java.util.*;

public class Main {
 	public static void main(String args[])throws IOException {
     	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      	StringTokenizer st = new StringTokenizer(br.readLine());
      	int N = Integer.parseInt(st.nextToken());
      	int A = Integer.parseInt(st.nextToken());
      	int B = Integer.parseInt(st.nextToken());
      
      	st = new StringTokenizer(br.readLine());
      	int[] arr = new int[N];
      	int i = 1;
      	long ans = 0;
      	arr[0] = Integer.parseInt(st.nextToken());
      	while(st.hasMoreTokens()) {
         	arr[i] =  Integer.parseInt(st.nextToken());
          	int dif = arr[i] - arr[i-1];
          	if(dif*A > B) {
             	 ans += B;
            } else {
             	ans += (dif*A); 
            }
          	i++;
        }
      	System.out.println(ans);
    }
}