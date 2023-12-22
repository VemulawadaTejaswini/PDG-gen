import java.io.*;
import java.util.Arrays;
class Main{
	public static void main(String[] args) throws IOException {
		int i,j;
		int[] n = new int[5];
		String[] str = new String[5];
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		str = in.readLine().split(" ");
		Arrays.fill(n,10001);
		for(i=0;i<3;i++)
			n[i] = Integer.parseInt(str[i]);
		Arrays.sort(n);
		System.out.println(n[0]+" "+n[1]+" "+n[2]);
	}
}