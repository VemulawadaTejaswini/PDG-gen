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
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < quiz.length; i++) {
			int count = 0;
			
			int tmp = 0;
			
			int first = -1;
			
			while (first < 0 && quiz[i][1] > quiz[i][0] + tmp && quiz[i][0] + tmp < array.length) {
				first = acBeginIndex.indexOf(quiz[i][0] + tmp++);
			}
			
			tmp = 0;
			
			int last = -1;
			
			while (last < 0 && quiz[i][0] < quiz[i][1] + tmp && quiz[i][1] + tmp >= 0) {
				last = acBeginIndex.lastIndexOf(quiz[i][1] + tmp--);
			}
			
			if (last < 0 || first < 0 || last == first) {
				sb.append(0);
			} else {
				sb.append(last -  first + 1);
			}
			
			sb.append('\n');
		}
		
		System.out.print(sb.toString());
	}
}

