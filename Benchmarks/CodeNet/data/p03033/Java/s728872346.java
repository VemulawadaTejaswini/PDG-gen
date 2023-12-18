import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
 
 
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		int N = Integer.parseInt(sc.next());
		int Q = Integer.parseInt(sc.next());
		
		int[][] con = new int[N][3];
		for(int i=0;i<N;i++){
			con[i][0] = Integer.parseInt(sc.next());
			con[i][1] = Integer.parseInt(sc.next());
			con[i][2] = Integer.parseInt(sc.next());
		}
		Arrays.sort(con,(a,b)->Integer.compare(a[2], b[2]));
		
		for(int i=0;i<Q;i++){
			int D = Integer.parseInt(sc.next());
			boolean flag = true;
			for(int j=0;j<N;j++){
				int X = con[j][2];
				int S = con[j][0];
				int T = con[j][1];
				if(S<=(X+D) && (X+D)<T){
					System.out.println(X);
					flag = false;
					break;
				}
			}
			if(flag)System.out.println("-1");
			
		}
		
		//System.out.println(ans);
		
		
		
	}
	
}

