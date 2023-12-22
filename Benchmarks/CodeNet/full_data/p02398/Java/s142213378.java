import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int i,cnt=0;
		int[] n = new int[5];
		String[] str = new String[5];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine().split(" ");
		for(i=0;i<3;i++){
			n[i]=Integer.parseInt(str[i]);
		}
		for(i=n[0];i<=n[1];i++){
			cnt+=(n[2]%i==0 ? 1 : 0);
		}
		System.out.println(cnt);
	}
}