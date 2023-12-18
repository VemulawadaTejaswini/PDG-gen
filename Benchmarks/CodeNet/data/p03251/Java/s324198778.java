import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();

		int data[] = new int[n+m];
		int xdata[] = new int[n];
		int ydata[] = new int[m];
		int count = 0;

		for (int i = 0;i<n+m ;i++ ) {
			data[i] = sc.nextInt();
			if (i<n) {
				xdata[i] = data[i];
			}else{
				ydata[i-n] = data[i];
			}
		}

		Arrays.sort(data);
		Arrays.sort(xdata);
		Arrays.sort(ydata);

		for (int i = 0;i<n+m ;i++ ) {
			if (x<data[i]&&data[i]<=y) {
				if (xdata[xdata.length]<data[i]&&ydata[ydata.length]>=data[i]) {
					count++;
				}
			}
		}
		if (count>0) {
			System.out.println("No war");
		}else{
			System.out.println("War");
		}


	}
}
