import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<Integer> tubeB = new ArrayList<Integer>();
		ArrayList<Integer> tubeC = new ArrayList<Integer>();
		ArrayList<String> ans = new ArrayList<String>();
		
		int n = Integer.parseInt(br.readLine());
		main:
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			
			tubeB.add(Integer.parseInt(st.nextToken()));
			tubeC.add(Integer.parseInt(st.nextToken()));
			
			while (st.hasMoreTokens()) {
				
				boolean flag = false;
				int ball = Integer.parseInt(st.nextToken());
				if (tubeB.get(tubeB.size() - 1) < ball) {
					tubeB.add(ball);
					flag = true;
					continue;
				}
				if (tubeC.get(tubeC.size() - 1) < ball) {
					tubeC.add(ball);
					flag = true;
					continue;
				}
				if (!flag) {
					ans.add("NO");
					continue main;
				}
			}
			ans.add("YES");
		}
		
		for (String a : ans) {
			System.out.println(a);
		}
	}
	
}