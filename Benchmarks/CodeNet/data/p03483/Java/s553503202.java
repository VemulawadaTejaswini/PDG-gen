import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
	
	private void debugPrint(List<Character> list) {
		for(char c : list) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public int solve(String line) {
		int[] countAlphabets = new int['z'-'a'+1];
		Arrays.fill(countAlphabets, 0);
		
		LinkedList<Character> list = new LinkedList<Character>();
		for (int i=0; i<line.length(); i++) {
			char c = line.charAt(i);
			countAlphabets[c-'a']++;
			list.addLast(c);
		}
		
		// 回文にできるか確認
		boolean permitOdd = (line.length() % 2 == 1);
		for (int i=0; i<countAlphabets.length; i++) {
			if (countAlphabets[i] % 2 == 1) {
				if (permitOdd == false) {
					return -1;
				} else {
					permitOdd = false;
				}
			}
		}
		
		// 最小回数を計算
		int count = 0;
		while (list.size() >= 2) {
			// debugPrint(list);
			char last = list.removeLast();
			
			if (countAlphabets[last-'a'] == 1) {
				// 最後に1個残る要素の場合は、前の要素と入れ替えてやり直し
				list.add(list.size()-1, last);
				count++;
				continue;
			}
			
			// 末尾と同じ文字を先頭から探して、末尾と合わせて削除
			ListIterator<Character> it = list.listIterator();
			while (it.hasNext()) {
				char c = it.next();
				if (last == c) {
					it.remove();
					countAlphabets[c-'a'] -= 2;
					break;
				} else {
					count++;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String line = in.next();
		in.close();
		
		Main main = new Main();
		int result = main.solve(line);
		System.out.println(Integer.toString(result));
	}
}
