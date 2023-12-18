import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		String[] ary = S.split("");
		Set<String> set = new HashSet<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0;i < ary.length;i++){
			for(int j = i+1;j < ary.length;j++){
				for(int k = j+1;k < ary.length;k++){
					sb.append(ary[i]);
					sb.append(ary[j]);
					sb.append(ary[k]);
					set.add(sb.toString());
					sb.delete(0, sb.length());
				}
			}
		}
		System.out.println(set.size());
	}
}