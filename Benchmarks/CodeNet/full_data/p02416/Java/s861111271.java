import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = 0;
		do{
			String[] st = sc.readLine().split("");
			int[] x = new int[st.length];
			if(st[0].equals("0"))
				break;
			for(int i = 0;i < st.length;i++){
				x[i] = Integer.parseInt(st[i]);
			}
			for(int n:x){
				t += n;
			}
			sb.append(t).append("\n");
			t = 0;
		}while(true);
		System.out.print(sb);
	}
}