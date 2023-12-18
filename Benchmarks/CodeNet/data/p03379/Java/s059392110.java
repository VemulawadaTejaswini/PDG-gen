import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int m = stdin.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int N[] = new int[m];
		int C[] = new int[m];
		int x=0;
			for (int i = 0; i < m; i++) {
				x = stdin.nextInt();
				N[i] = x;
				}
			int y[] = N.clone();
			Arrays.sort(y);
			int l = y[m/2-1];
			int r= y[m/2];
			
			for (int k=0;k<m;k++) {
				if(N[k]<=l) {
					System.out.println(l);
				}else {
					System.out.println(r);

				}
			}
			}

		}

	