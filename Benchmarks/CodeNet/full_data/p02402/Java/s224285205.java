import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line1 = br.readLine();
		int n = Integer.parseInt(line1);
		int[] a = new int[n];
		String line2 = br.readLine();
		String[] str = line2.split(" ");
		for (int i = 0; i < n ; i++){
			a[i] = Integer.parseInt(str[i]);
		}
		int max = a[0];
		int min = a[0];
		long sum = (long) a[0];
		for (int i = 1; i < n ; i++){
			max = Math.max(max,a[i]);
			min = Math.min(min,a[i]);
			sum += (long) a[i];
		}
		System.out.println(min + " " + max +" "+ sum);
	}
}