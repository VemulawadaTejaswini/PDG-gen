import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int ans[] = new int[w];
		for (int i=0;i<w;i++) {
			ans[i] = i+1;
		}
		for (int i=0;i<n;i++) {
			String line = sc.next();
			int a = line.indexOf(',');
			int x1 = Integer.parseInt(line.substring(0,a))-1;
			int x2 = Integer.parseInt(line.substring(a+1,line.length()))-1;
			int temp = ans[x1];
			ans[x1] = ans[x2];
			ans[x2] = temp;
		}
		for (int i=0;i<w;i++) {
			System.out.println(ans[i]);
		}
	}
}