import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {
	public static int count = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		String[] sready = (br.readLine()).split(" ");
		int[] s = new int[n];
		for (int i = 0; i < n; i++)
			s[i] = Integer.parseInt(sready[i]);
		
		int q = Integer.parseInt(br.readLine());
		String[] tready = (br.readLine()).split(" ");
		int[] t = new int[q];
		for (int i = 0; i < q; i++)
			t[i] = Integer.parseInt(tready[i]);
		
		for (int i = 0; i < q; i++)
			doBinarySearch(s, t[i]);
		
		pw.println(count);
		pw.close();
	}
	
	public static void doBinarySearch(int[] s, int x) {
		int index1 = 0;
		int index2 = s.length - 1;
		if (x < s[index1])
			return;
		else if (x > s[index2])
			return;
		
		int point = (index2 - index1) / 2;
		do {
			if (s[point] == x) {
				count++;
				break;
			}
			else if (s[point] > x)
				index2 = point;
			else
				index1 = point;
			point = index1 + (index2 - index1) / 2;
		} while (index2 - index1 > 1);
		if (index2 - index1 ==1) {
			if (s[index1] == x)
				count++;
			else if (s[index2] == x)
				count++;
		}
	}
}