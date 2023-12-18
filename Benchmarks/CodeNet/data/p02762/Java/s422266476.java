import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayDeque;
import java.util.Queue;

public class FriendsAvailability{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int K = scan.nextInt();

		//友人，ブロック，無関係
		ArrayList<ArrayList<Integer>> friends = new ArrayList<ArrayList<Integer>>();
		ArrayList<ArrayList<Integer>> blocked = new ArrayList<ArrayList<Integer>>();

		for(int i = 0; i < N; i++){
			ArrayList<Integer> x = new ArrayList<Integer>();
			ArrayList<Integer> y = new ArrayList<Integer>();
			friends.add(x);
			blocked.add(y);
		}
		
		for(int i = 0; i < M; i++){
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() - 1;
			friends.get(a).add(b);
			friends.get(b).add(a);
		}

		for(int i = 0; i < K; i++){
			int a = scan.nextInt() - 1;
			int b = scan.nextInt() - 1;
			blocked.get(a).add(b);
			blocked.get(b).add(a);
		}
		
		//各連結成分のサイズ
		int size[] = new int[N];
		Arrays.fill(size, 0);
		//どの連結成分に属しているか
		int belong[] = new int[N];

		boolean seen[] = new boolean[N];
		Arrays.fill(seen, false);
		Queue<Integer> queue = new ArrayDeque<Integer>();
		
		for(int i = 0; i < N; i++){
			
			if(seen[i] != true){
				queue.add(i);
				seen[i] = true;
				while(!queue.isEmpty()){
					int x = queue.poll();
					belong[x] = i;
					size[belong[x]]++;
					for(int j = 0; j < friends.get(x).size(); j++){
						if(seen[friends.get(x).get(j)] != true){
							queue.add(friends.get(x).get(j));
							seen[friends.get(x).get(j)] = true;
							
						}
					}
				}
			}
		}
		
		for(int i = 0; i < N; i++){
			int result = size[belong[i]] - 1;
			for(int j = 0; j < friends.get(i).size(); j++){
				if(belong[friends.get(i).get(j)] == belong[i])result--;
			}
			for(int j = 0; j < blocked.get(i).size(); j++){
				if(belong[blocked.get(i).get(j)] == belong[i])result--;
			}
			System.out.println(result);
		}
	}
}