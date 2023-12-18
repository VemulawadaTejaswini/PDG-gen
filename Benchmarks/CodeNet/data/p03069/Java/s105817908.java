import java.util.*;
import java.io.*;
class MyUtil {
	public BufferedReader br;
	public MyUtil() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public int getInt() throws IOException {
		return Integer.valueOf(br.readLine());
	}

	public int[] getIntArray(int N) throws IOException {
		int[] ret = new int[N];
		for (int i=0; i < N; ++i) {
			ret[i] = Integer.valueOf(br.readLine());
		}
		return ret;
	}

	public String getString() throws IOException {
		return br.readLine();
	}

	public String[] getSplitString(String delim) throws IOException {
		return br.readLine().split(delim);
	}

	public String[] getStringArray(int N) throws IOException {
		String[] ret = new String[N];
		for (int i=0; i < N; ++i) {
			ret[i] = br.readLine();
		}
		return ret;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		new Tenka2019().c();
	}
}

class Tenka2019 {
	void c() throws IOException {
		MyUtil mu = new MyUtil();
		int N = mu.getInt();
		String S = mu.getString();
		int ans = 0;
		for(int i=0; i<N; ++i){
			if(S.charAt(i)=='#'){
				int b = 0, w = 0;
				//..##...##..
				//  ##xxx##xx
				//  xx...xx..
				for(int j=i; j<N; ++j){
					if(S.charAt(j)=='#'){
						b++;
					}else{
						w++;
					}
				}
				ans = (int)Math.min(b, w);
				break;
			}
		}
		System.out.println(ans);
	}
}