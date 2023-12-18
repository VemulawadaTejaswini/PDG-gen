import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] blue = new String[n];
		for (int i=0;i<n;i++)
			blue[i] = sc.next();
		int m = sc.nextInt();
		String[] red = new String[m];
		for (int i=0;i<m;i++)
			red[i] = sc.next();
		Arrays.sort(blue);
		Arrays.sort(red);
		int ans = 0;
		int temp = 0;
		for (int i=0;i<n;) {
			String s = blue[i];
			temp = 1;
			for (i++;i<n;i++) {
				if (!s.equals(blue[i]))
					break;
				temp++;
			}
			if (ans>=temp)
				continue;
			for (int j=0;j<m;j++) {
				if (s.equals(red[j])) {
					temp--;
					for (j++;j<m;j++) {
						if (!s.equals(red[j]))
							break;
						temp--;
					}
					break;
				}
			}
			if (ans<temp)
				ans = temp;
		}
		System.out.println(ans);
	}
}