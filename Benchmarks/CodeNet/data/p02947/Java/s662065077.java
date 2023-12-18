import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		String sort = "";
		String[] anagram = new String[N];
		int count = 0;
		//文字列一つずつ並び替え
		for(int i = 0; i<N ; i++) {
			sort = sc.nextLine();
			String[] change = sort.split("");
			Arrays.sort(change);
			anagram[i] = String.join("",change);
		}
		//Hashsetに一つずつ判定して入れる。重複があればカウント。
		Set<String> checklist = new HashSet<String>();
		for(int i = 0; i<N; i++) {
			if(checklist.contains(anagram[i])) {
				count++;
			}else {
				checklist.add(anagram[i]);
			}
		}
		count = count>=2? count+1:count;
		System.out.println(count);
	}

}
