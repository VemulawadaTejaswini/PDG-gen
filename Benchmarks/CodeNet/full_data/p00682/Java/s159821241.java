import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int cnt=1;
			while(in.hasNextInt()){
				int n = in.nextInt();
				if(n==0) break;
				int xs[] = new int[n], ys[] = new int[n];
				for(int i=0; i<n; i++){
					xs[i] = in.nextInt();
					ys[i] = in.nextInt();
				}
				int ans = 0;
				for(int i=0; i<n; i++){
					ans += get2Area(xs[i], ys[i], xs[(i+1)%n], ys[(i+1)%n]);
				}
				System.out.printf("%d %.1f\n", cnt, Math.abs(ans/2.0));
				cnt++;
			}
	}
	
	private static int get2Area(int x1, int y1, int x2, int y2){
		return x2*y1 - x1*y2;
	}
}