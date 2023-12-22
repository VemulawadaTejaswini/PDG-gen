import java.io.*;

class Main {
	public static void main(String args[]) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String t[];
			int w = Integer.parseInt(reader.readLine());
			int n = Integer.parseInt(reader.readLine());
			int a[] = new int[w];
			for(int i = 0;i < w;i++) {
				a[i] = i+1;
			}
			for(int i = 0;i < n;i++) {
				t = reader.readLine().split(",");
				swap(a, Integer.parseInt(t[0])-1, Integer.parseInt(t[1])-1);
			}
			for(int i = 0;i < w;i++) {
				System.out.println(a[i]);
			}
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
	public static void swap(int a[], int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
}