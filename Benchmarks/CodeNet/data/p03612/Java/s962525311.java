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
			str = br.readLine();
			String[] s = str.split(" ",0);
			boolean[] count = new boolean[N];
			Arrays.fill(count, false);
			for(int i=0; i< N;i++) {
				if(i+1 == Integer.parseInt(s[i])) {
					count[i] = true;
				}
			}
			int x = 0;
			int conti = 0;
			for(int i = 0; i < N-1 ; i++) {
				if(count[i]==true && count[i+1]==true) {
					conti++;
				}else {
					// 3 -> 2  4 -> 2  5->3 6->3
					if(conti > 0){//true (true false)
						x -=conti/2+1;
						conti = 0;
					}
				}
				if(count[i]==true) x++;
			}
			System.out.println(x);
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
