import java.io.*;
import java.math.*;
import java.util.*;
public class Main {

	public static void main(String[] args) { 
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		boolean[] diff = new boolean[N]; //N not possible as max gap = N-1; N/2 is bad for even
		boolean[] used = new boolean[N+1];
		int bad = -1;
		if (N%2==0) bad=N/2;
		System.out.println(1+" "+N);
		diff[1]=true;
		diff[N-1]=true;
		used[1]=true;
		used[N]=true;
		M--;
		int START = 2;
		while (M>0) {
			for (int d = N-1; d>=1; d--) {
				int diff1 = d;
				int diff2 = N-d;
				int END = START+diff1;
				if (!diff[diff1]&&!diff[diff2]&&!used[END]&&diff1!=bad) {
					System.out.println(START+" "+END);
					diff[diff1]=true;
					diff[diff2]=true;
					used[END]=true;
					START++;
					M--;
					if (M==0) break;
				}
			}
		}
	}	
}