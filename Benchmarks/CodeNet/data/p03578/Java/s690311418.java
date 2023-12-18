import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			int N = Integer.parseInt(str);
			int[] data = new int[200001];
			Arrays.fill(data, 0);
			str = br.readLine();
			String[] s = str.split(" ",0);
			for(int i = 0;i < N;i++) {
				data[Integer.parseInt(s[i])]++;
			}
			str = br.readLine();
			int M = Integer.parseInt(str);
			str = br.readLine();
			s = str.split(" ",0);
			for(int i = 0; i < M;i++) {
				int x = Integer.parseInt(s[i]);
				if(data[x]==0) {
					System.out.println("NO");
					break;
				}else {
					data[x]--;
				}
				if(i==M-1) System.out.println("YES");
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
