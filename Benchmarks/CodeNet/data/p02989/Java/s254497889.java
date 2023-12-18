import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		//    	File file = new File("src/in.txt");
		//    	Scanner sc = new Scanner(file);

		Scanner sc = new Scanner(System.in);

		int N = Integer.parseInt(sc.next());
		int[] d = new int[N];
		for(int i=0;i<N;i++) {
			d[i] = Integer.parseInt(sc.next());
		}
		int ans = 0;
		Arrays.sort(d);
		for(int i=d[0];i<=d[N-1];i++) {
			int cnt=0;
			for(int j=0;j<N;j++) {
				if(d[j]<i) {
					cnt++;
				}
			}
			if(d.length-cnt==cnt) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}