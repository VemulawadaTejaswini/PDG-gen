import java.io.*;
import java.util.Arrays;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			Arrays.sort(s);
			int m = Integer.parseInt(br.readLine());
			String[] t = br.readLine().split(" ");
			for(int i = 0;i < m;i++) {
				int o = n/2;
				if(t[i].compareTo(s[o]) < 0) {
					while(true) {
						o /= 2;
						if(t[i].compareTo(s[o]) >= 0)
							break;
					}
					if(t[i].equals(s[o])) {
						count++;
					}
				}
				else if(t[i].compareTo(s[o]) > 0) {
					while(true) {
						o = o + (n-o)/2;
						if(t[i].compareTo(s[o]) <= 0 || o == n-1)
							break;
					}
					if(t[i].equals(s[o])) {
						count++;
					}
				}
				else {
					count++;
				}
			}
			System.out.println(count);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}