import java.util.*;
 
public class Main { 
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int[] to = new int[n];
		int[] moved = new int[n+1];
		for(int i=0; i<n; i++){
			to[i] = sc.nextInt();
		}
		int moveCount = 0;
		int now = 1;
		int end = 0;
		moved[1]++;
		for(int i=0; i<n+1; i++){
			if(moved[to[now-1]] > 0){
				end = to[now-1];
				moveCount++;
				break;
			}
			moved[to[now-1]]++;
			now = to[now-1];
			moveCount++;
		}
		int count = 0;
		if(end != 1){
			now = 1;
			for(int i=0; i<n+1; i++){
				if(to[now-1] == end) break;
				now = to[now-1];
				count++;
			}
			moveCount = moveCount -1 - count;
		}
		k = k-count;
		long amari = k%moveCount;
		if(count>0)amari = amari-1;
		now = end;
		for(int i=0; i<n+1; i++){
			if(amari == 0) break;
			now = to[now-1];
			amari = amari-1;
		}
		int ans = now;
		System.out.println(ans);

	}
}
