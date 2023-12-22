import java.io.*;
import java.util.StringTokenizer;

class Main {
	public static void main(String args[]) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int n = Integer.parseInt(br.readLine());
			for (int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				int line[] = {0,0};
				for (int j=0;j<10;j++) {
					int next = Integer.parseInt(st.nextToken());
					if (next>line[0]&&next>line[1]) {
						line[Switch(next,line[0],line[1])] = next;
					} else if (next>line[0]) {
						line[0] = next;
					} else if (next>line[1]) {
						line[1] = next;
					} else {
						System.out.println("NO");
						break;
					}
					if (j==9) System.out.println("YES");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static int Switch(int ball,int l1,int l2) {
		return (ball-l1)>(ball-l2) ? 1 : 0;
	}
}