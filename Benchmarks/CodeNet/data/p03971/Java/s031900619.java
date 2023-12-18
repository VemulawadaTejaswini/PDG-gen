import java.util.*;
import java.io.*;
public class Main {
public static void main(String [] args)throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	int n = Integer.parseInt(st.nextToken());
	int a = Integer.parseInt(st.nextToken());
	int b = Integer.parseInt(st.nextToken());
	StringBuilder sb = new StringBuilder();
	int cnt = 0;
	for(int i = 0;i < str.length();i++){
		if(str.charAt(i) == 'c')
			sb.append("NO");
		else if(cnt < a + b){
		    ++cnt;
			sb.append("YES");
		}
		else sb.append("NO");
		sb.append('\n');	
	}
	System.out.print(sb);
}
}