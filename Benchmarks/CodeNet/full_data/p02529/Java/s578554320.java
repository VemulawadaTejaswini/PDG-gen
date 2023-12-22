import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			int a[] = new int[n];
			for(int i = 0;i < n;i++) {
				a[i] = Integer.parseInt(s[i]);
			}
			int m = Integer.parseInt(br.readLine());
			String[] t = br.readLine().split(" ");
			int b[] = new int[m];
			for(int i = 0;i < m;i++) {
				b[i] = Integer.parseInt(t[i]);
			}
			for(int i = 0;i < a.length;i++) {
				for(int j = 0;j < b.length;j++) {
					if(a[i] == b[j]) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}