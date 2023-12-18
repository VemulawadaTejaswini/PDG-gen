import java.io.*;

class Main {
	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = reader.readLine();
			int n = Integer.parseInt(line);
			long ans = 0;
			int[] a = new int[n];
			for(int i = 0; i < n; i++){
				a[i] = i + 1;
				if((a[i] % 3 != 0) && (a[i] % 5 != 0)){
					ans += a[i];
				}
			}
			System.out.println(ans);
		} catch(IOException e) {
			System.out.println(e);
		} catch(NumberFormatException e) {
			System.out.println(e);
		}
	}
}