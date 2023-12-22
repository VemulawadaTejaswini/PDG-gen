import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		int u = Integer.parseInt(st.nextToken());
		if(u*t>=s){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
