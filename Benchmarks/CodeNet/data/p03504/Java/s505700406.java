import java.util.*;

//080D
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), C = sc.nextInt();
		int sec = (int)1e5;
//		int chan[][] = new int[C][sec + 1];
		Integer overlap[] = new Integer[sec + 1];
		Arrays.fill(overlap,0);
		for(int i=0;i<N;i++) {
			int s = sc.nextInt(), t = sc.nextInt(), c = sc.nextInt();
			for(int j=s;j<=t;j++) {
				overlap[j]++;
			}
		}
		
		Arrays.sort(overlap,Comparator.reverseOrder());
		int ans = overlap[0];
		System.out.println(ans);
	}
	
	
}
