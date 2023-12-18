import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		
		int[][] quiz = new int[q][2];
		
		for (int i = 0; i < quiz.length; i++) {
			quiz[i][0] = sc.nextInt() - 1;
			quiz[i][1] = sc.nextInt();
		}
		
		char[] array = str.toCharArray();
		
		boolean ac = false;
		
		List<Integer> acBeginIndex = new ArrayList<>();
		List<Integer> acEndIndex = new ArrayList<>();
		
		int tmpIndex = 0;
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] == 'A') {
				ac = true;
				tmpIndex = j;
			} else if (ac && array[j] == 'C') {
				acBeginIndex.add(tmpIndex);
				acEndIndex.add(j + 1);
				ac = false;
			} else {
				ac = false;
			}
		}
		
		for (int i = 0; i < quiz.length; i++) {
			int count = 0;
			
			for (int j = 0; j < acBeginIndex.size(); j++) {
				if (acBeginIndex.get(j) >= quiz[i][0] && acEndIndex.get(j) <= quiz[i][1]) {
					count++;
				} else if (acBeginIndex.get(j) > quiz[i][1]) {
					break;
				}
			}
			
			System.out.println(count);
		}
	}
}
