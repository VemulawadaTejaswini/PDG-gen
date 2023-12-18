import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.nextLine();
		String problem = sc.nextLine();
		
		Character current;
		int left = 0;
		int right = 0;
			
		ArrayList<Character> answer = new ArrayList<Character>();
		
		// "(" と ")" の数を数える。もし、"(" の次に ")" があったら、"(" と ")" の数をそれぞれ1ずつ減らす。
		// 最終的に、ペアを持たない括弧の数がわかる。
		for (int i = 0; i < N; i++) {
			current = problem.charAt(i);
			answer.add(current);
			
			if(current == '(') {
				left++;
			} else {
				right++;
			}
			
			if(i == 0) {
				continue;
			}

			if(answer.get(i - 1) == '(' && answer.get(i) == ')') {
				left--;
				right--;
			}
		}
		// debug
		// System.out.println("left: " + left + " right: " + right);
		
		// ")" の数だけ配列の先頭に "(" を加え、"(" の数だけ配列の末尾に ")" を加える。
		for (int i = 0; i < right; i++) {
			answer.add(0, '(');
		}
		for (int i = 0; i < left; i++) {
			answer.add(')');
		}
		
		for (int i = 0; i < answer.size(); i++) {
			System.out.print(answer.get(i));
		}
		
	}	

}