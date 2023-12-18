import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		StringTokenizer st;
		
		
		int n = sc.nextInt(), m = sc.nextInt();
		int[] num = new int[n];
		Arrays.fill(num, -1);
		
		boolean flag = true;
		for(int i = 0; i < m; i++) {
			int j = sc.nextInt() - 1, c = sc.nextInt();
			if(num[j] == -1) {
				num[j] = c;
			} else if(num[j] != -1 && num[j] != c) {
				flag = false;
				break;
			}
		}
		
		if(num[0] == 0)
			flag = false;
		
		for(int i = 0; i < n; i++)
			if(num[i] == -1) {
				if(i == 0)
					num[i] = 1;
				else
					num[i] = 0;
			}
		
		String s = "";
		for(int i = 0; i < n; i++)
			s += "" + num[i];
		System.out.println(flag ? s : -1);
	}
}