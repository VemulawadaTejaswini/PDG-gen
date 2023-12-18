import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] xp = new int[N+1];
		for(int i = 0; i < N; i++) xp[i] = sc.nextInt();
		xp[N] = X;
		
		Arrays.sort(xp);
		//for(int i : xp) System.out.println(i);
		int[] dist = new int[N];
		for(int i = 0; i < N; i++) dist[i] = xp[i+1] - xp[i];
		int distMax = dist[N-1];
		
		int ans = 1;
		for(int i = 2; i <= distMax; i++){
			boolean tf = true;
			for(int j = 0; j < N; j++){
				if(dist[j] % i != 0){
					tf = false;
					break;
				}
			}
			if(tf) ans = i;
		}
		
		System.out.println(ans);
	}
}