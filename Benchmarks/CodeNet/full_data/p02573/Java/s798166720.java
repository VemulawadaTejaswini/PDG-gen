import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int M = stdIn.nextInt();
		ArrayList<ArrayList <Integer>> friendSet = new ArrayList<ArrayList<Integer>>();
		
		for(int i = 0; i < M; i ++) {
			int A = stdIn.nextInt();
			int B = stdIn.nextInt();
			if(friendSet.size() == 0) {
				ArrayList<Integer> subSet = new ArrayList<Integer>();
				subSet.add(A);
				subSet.add(B);
				friendSet.add(subSet);
			}else {
				boolean isAdded = false;
				for(int j = 0; j < friendSet.size(); j ++) {
					if(friendSet.get(j).contains(A) && !friendSet.get(j).contains(B)) {
						friendSet.get(j).add(B);
						isAdded = true;
						break;
					}else if(friendSet.get(j).contains(B) && !friendSet.get(j).contains(A)) {
						friendSet.get(j).add(A);
						isAdded = true;
						break;
					}else if(friendSet.get(j).contains(A) && friendSet.get(j).contains(B)){
						isAdded = true;
						break;
					}
				}
				if(!isAdded) {
					ArrayList<Integer> subSet = new ArrayList<Integer>();
					subSet.add(A);
					subSet.add(B);
					friendSet.add(subSet);
				}
			}
		}
		
		int ans = -1;
		
		for(int i = 0; i < friendSet.size(); i ++) {
			ans = Math.max(ans, friendSet.get(i).size());
		}
		
		System.out.println(ans);
		
	}
}