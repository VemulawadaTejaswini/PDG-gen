import java.math.BigDecimal;
import java.util.*;
public class Main {
	public static void main(String[] args){
      	
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int Harr[] = new int[N];
		boolean H[]  = new boolean[N];
		int road[][] = new int[M][2];
		for (int i = 0; i < N; i++) {
			Harr[i] = sc.nextInt();
			H[i] = true;
		}
		for (int i = 0; i < road.length; i++) {
			road[i][0] = sc.nextInt();
			road[i][1] = sc.nextInt();
		}
		for (int i = 0; i < road.length; i++) {
			int H1 = Harr[road[i][0]-1];
			int H2 = Harr[road[i][1]-1];
			if (H1<H2) {
				H[road[i][0]-1] = false;
			} else if(H1==H2){
				H[road[i][0]-1] = false;
				H[road[i][1]-1] = false;
			}
		}
		int cnt = 0;
		for (int i = 0; i < H.length; i++) {
			if(H[i]){
				cnt++;
			}
		}

		
		System.out.println(cnt);
		sc.close();
    }
		
		
}
