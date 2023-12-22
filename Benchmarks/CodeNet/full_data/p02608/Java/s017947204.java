import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int N=sc.nextInt();
		int re[] = new int[10050];
		Arrays.fill(re,0);
		for(int x=1;x<105;x++) {
			for(int y=1;y<105;y++) {
				for(int z=1;z<105;z++) {
					int v=x*x+y*y+z*z+x*y+y*z+z*x;
					if(v<10050) {
						re[v]++;
					}
				}
			}
		}
		for(int i=1;i<N;i++)
			System.out.println(re[i]);
	}
}