import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer n = Integer.valueOf(br.readLine());
		String[] temp = br.readLine().split(" ");
		Integer[] a = new Integer[n];
		int i, alice=0, bob=0;
		for(i=0;i<n;i++) a[i]= Integer.parseInt(temp[i]);
		Arrays.sort(a);
		for(i=0;i<n;i++) if(i % 2 != 0) alice += a[i]; else bob += a[i];
		System.out.println(Math.abs(alice - bob));
	}
}
