import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		String s = sc.next();
		String t = sc.next();

		sc.close();

		char[] schars = s.toCharArray();
		char[] tchars = t.toCharArray();

		Character[] schars2;
		Integer[] scrl;

		//まず存在しない場合を判定
		{
			Set<Character> scset = new HashSet<>();
			for (char x : s.toCharArray()) {
				scset.add(x);
			}

			Set<Character> tcset = new HashSet<>();
			for (char x : t.toCharArray()) {
				tcset.add(x);
			}

			if (!scset.containsAll(tcset)) {
				out.println("-1");
				return;
			}
		
		{
			List<Character> ccc = new ArrayList<>();
			List<Integer> iii = new ArrayList<>();
			boolean b = false;
			for(char x : schars) {
				if(tcset.contains(x)) {
					ccc.add(x);
					iii.add(1);
					b = false;
				}else {
					if(b) { //前の文字も無効文字
						iii.set(iii.size()-1,  iii.get(iii.size()-1) + 1);
					}else {
						ccc.add('Z');
						iii.add(1);
					}
					b = true;
				}
			}
			
			schars2 = (Character[])ccc.toArray(new Character[] {});
			scrl = (Integer[])iii.toArray(new Integer[] {});
		}
		}
		
		
		int sp = 0;
		int tp = 0;
		long ans = 0;
		while (tp < t.length()) {
			if (schars2[sp] == tchars[tp]) {
				tp++;
				sp = (sp + 1) % schars2.length;
				ans++;
			}else {
				sp = (sp + 1) % schars2.length;
				ans += scrl[sp];
			}
		}

//		int sp = 0;
//		int tp = 0;
//		long ans = 0;
//		while (tp < t.length()) {
//			if (schars[sp] == tchars[tp]) {
//				tp++;
//			}
//			sp = (sp + 1) % schars.length;
//			ans++;
//		}
		
		
		out.println(ans);
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
