import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt(); //問題数
		
		int[] d = new int[n]; //難易度
		
		for(int i = 0; i < n; i++) {
			d[i] = stdIn.nextInt();
		}
		
		Arrays.sort(d);
		
		int cnt = 0;
		if(d.length%2!=0) {
			System.out.println(cnt);
		}else {
			System.out.println(d[d.length/2]-d[d.length/2-1]);
		}
		
	}

}
