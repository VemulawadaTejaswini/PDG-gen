import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String buf;

		try {
			while ((buf = br.readLine())!=null) {
				int r[] = {1,1,1,1,1,1,1,1,1,1};
				StringTokenizer st = new StringTokenizer(buf);
				int c[] = new int[4];
				for (int i=0;i<3;i++) {
					c[i] = Integer.parseInt(st.nextToken());
					r[c[i]-1] = 0;
				}
				int count = 0;
				for (int i=0;i<10;i++) { //7*6=42 42/2=21
					if (r[i]==0) continue;
					c[3] = i+1;
					r[i] = 0;
					for (int j=0;j<10;j++) {
						if (r[j]==1&&c[0]+c[1]+j+1<=20) count++;
					}
					r[i] = 1;
				}
				if (count>=21) System.out.println("YES");
				else System.out.println("NO");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}