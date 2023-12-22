import java.util.*;
import java.io.*;
public class Main
{
    
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().trim().split(" ");
		int n = Integer.parseInt(s[0]);
		long k = Long.parseLong(s[1]);
		String[] str = br.readLine().trim().split(" ");
		int[] arr = new int[n+1];
		for(int i = 0; i < n; i++){
		    arr[i+1] = Integer.parseInt(str[i]);
		}
		int ans = 1;
		while(k > 0){
		    ans = arr[ans];
		    k--;
		}
		System.out.println(ans);
	}
}

