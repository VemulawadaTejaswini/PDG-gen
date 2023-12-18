import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		ArrayList<Integer> height = new ArrayList();
		HashSet highest = new HashSet();
		HashSet roads = new HashSet();

		for (int i = 0; i < N; i++){
			int H = scan.nextInt();
			height.add(H);
		}
		for (int j = 0; j < M; j++){
			int A = scan.nextInt();
			int B = scan.nextInt();
			if (height.get(A - 1) > height.get(B - 1)){
				highest.add(A);
			}else if (height.get(A - 1) < height.get(B - 1)){
				highest.add(B);
			}
			roads.add(A);
			roads.add(B);
		}
		System.out.println(N - roads.size() + highest.size());
	}
}