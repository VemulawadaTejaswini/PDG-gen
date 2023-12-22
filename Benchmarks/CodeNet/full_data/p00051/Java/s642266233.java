import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		while(n-->0){
			char[] c = bf.readLine().toCharArray();
			Arrays.sort(c);
			String s = new String(c);
			StringBuffer sb = new StringBuffer(s);
			int min = Integer.parseInt(new String(c),10);
			int max = Integer.parseInt(sb.reverse().toString(),10);
			System.out.println(max-min);
		}
	}
}