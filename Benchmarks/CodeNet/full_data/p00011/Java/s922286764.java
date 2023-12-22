import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int w = stdIn.nextInt();
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++) {
			String tmp = stdIn.next();
			String[] tmp2 = tmp.split(",");
			a[i] = Integer.parseInt(tmp2[0]);
			b[i] = Integer.parseInt(tmp2[1]);
		}
		int[] loc = new int[w];
		for(int i = 0; i < w; i++) {
			int p = i+1;
			for(int j = 0; j < n; j++) {
				if(a[j] == p) {
					p = b[j];
				}
				else if(b[j] == p) {
					p = a[j];
				}
			}
			loc[p-1] = i+1;
		}
		
		for(int i = 0; i < w; i++) {
			System.out.println(loc[i]);
		}
	}
}