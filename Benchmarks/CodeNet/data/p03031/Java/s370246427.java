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
		int M = Integer.parseInt(sc.next());
		
		List<int[]> lines = new ArrayList<>();
		
		for(int i=0;i<M;i++){
			int k = Integer.parseInt(sc.next());
			int[] line = new int[k];
			for(int j=0;j<k;j++){
				line[j] = Integer.parseInt(sc.next())-1;
			}
			lines.add(line);
		}
		
		int[] P = new int[M];
		for(int i=0;i<M;i++){
			P[i] = Integer.parseInt(sc.next());
		}
		
		int ans = 0;
		for(int i=0; i<(1<<N);i++){
			boolean flag = true;
			for(int j=0;j<M;j++){
				int on = 0;
				for(int k:lines.get(j)){
					if((1&i>>k)==1)on++;
				}
				if(on%2 != P[j]){
					flag = false;
					break;
				}
			}
			if(flag)ans++;
		}
	
		System.out.println(ans);
		
		
		
	}
	
}

