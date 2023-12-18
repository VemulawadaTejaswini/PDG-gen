import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		boolean possible = true;
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			list.add(input.nextInt());
		}
		
		int[] arr = new int[Integer.MAX_VALUE-8];
		for(int i = 0; i < list.size(); i++) {
			arr[list.get(i)]++;
		}
		
		int M = input.nextInt();
		ArrayList<Integer> problems = new ArrayList<Integer>();
		for(int i = 0; i < M; i++) {
			problems.add(input.nextInt());
		}
		
		for(int i = 0; i < problems.size(); i++) {
			if(arr[problems.get(i)] > 0){
				arr[problems.get(i)]--;
			}
			else {
				possible = false; 
				break;
			}
		}
		if(possible)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
