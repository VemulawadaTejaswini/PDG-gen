import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String str = br.readLine();
			//int N = Integer.parseInt(str);
			//StringBuilder sb = new StringBuilder();
			String[] s = str.split(" ",0);
			int H = Integer.parseInt(s[0]);
			int W = Integer.parseInt(s[1]);
			int[] asc = new int[128];
			Arrays.fill(asc, 0);
			for(int i = 0; i <H;i++) {
				str = br.readLine();
				for(int j = 0;j < W;j++) {
					asc[str.charAt(j)]++;
				}
			}
			//System.out.println("OK");
			int odd = 0;
			int four = 0;
			for(int i = 0;i<128;i++) {
				if(asc[i]%2!=0) {
					odd++;
				}
				if(asc[i] > 3) {
					four += asc[i];
				}
			}
			int res = 0;
			if(four < (H/2)*(W/2)*4) {
				res++;
			}
			if(H%2==0 && W%2 == 0) {
				if(odd > 0) res++;
				for(int i = 0;i<128;i++) {
					if(asc[i]%4!=0) {
						res++;
					}
				}
			}else if(H%2 == 1 && W%2 == 1) {
				if(odd  != 1) {
					res++;
				}
				for(int i = 0;i<128;i++) {
					if(asc[i]%2!=0) {
						res++;
					}
				}
				res--;
			}else {
				if(odd > 0) res++;
				for(int i = 0;i<128;i++) {
					if(asc[i]%2!=0) {
						res++;
					}
				}
			}

			if(res == 0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}
//			long max  = 1000000007;
		}catch (Exception e) {
			System.exit(0);
		}
	}

}
