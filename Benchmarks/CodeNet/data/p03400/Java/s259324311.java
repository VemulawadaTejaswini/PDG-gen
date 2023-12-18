import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {
 
	public static void main(String[] args) throws IOException {
		//File file = new File("input.txt");
		//Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0; i < N; i++) A[i] = sc.nextInt();
		int ans = X;
		
		for(int i = 0; i < N; i++){
			int j = 0;
			while(true){
				if(1 + j * A[i] <= D) ans++;
				else break;
				j++;
			}
		}
		
		System.out.println(ans);
		
	}
}