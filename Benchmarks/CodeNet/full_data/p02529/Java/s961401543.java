import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int count = 0;
			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			int m = Integer.parseInt(br.readLine());
			String[] t = br.readLine().split(" ");
			for(int i = 0;i < n;i++) {
				for(int j = 0;j < m;j++) {
					if(s[i].equals(t[j])) {
						count++;
						break;
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