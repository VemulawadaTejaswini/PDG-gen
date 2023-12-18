import java.io.File;
import java.io.FileInputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int L = sc.nextInt();
		boolean[][] road = new boolean[N+1][N+1];
		boolean[][] train = new boolean[N+1][N+1];
		for(int i = 0; i < K; i++){
			int p = sc.nextInt();
			int q = sc.nextInt();
			road[p][q] = true;
			road[q][p] = true;
		}
		for(int i = 0; i < L; i++){
			int r = sc.nextInt();
			int s = sc.nextInt();
			train[r][s] = true;
			train[s][r] = true;
		}
		
		int[] count = new int[N+1];
		
		
		for(int i = 1; i <= N - 1; i++){
			boolean[] visitedRoad = new boolean[N+1];
			visitedRoad[i] = true;
			ArrayList<Integer> queue = new ArrayList<>();
			queue.add(i);
			while(queue.size() != 0){
				int q = queue.remove(0);
				for(int j = 1; j <= N; j++){
					if(!visitedRoad[j] && road[q][j]){
						visitedRoad[j] = true;
						queue.add(j);
					}
				}
			}
			
			boolean[] visitedTrain = new boolean[N+1];
			visitedTrain[i] = true;
			queue.clear();
			queue.add(i);
			while(queue.size() != 0){
				int q = queue.remove(0);
				for(int j = 1; j <= N; j++){
					if(!visitedTrain[j] && train[q][j]){
						visitedTrain[j] = true;
						queue.add(j);
					}
				}
			}
			
			for(int j = i + 1; j <= N; j++)
				if(visitedRoad[j] && visitedTrain[j]){
					count[i]++;
					count[j]++;
				}
		}
		
		for(int i = 1; i <= N; i++){
			System.out.print(count[i] + 1);
			if(i == N) System.out.println();
			else System.out.print(" ");
		}
	}
}