import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		C(sc);
		sc.close();
	}
	
	public static void A(Scanner sc) {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println((a+b+1)/2);
	}
	
	public static void B(Scanner sc) {
		//一方の文字を辞書順にソート　他方を逆辞書順にソート
		String s = sc.next();
		String t = sc.next();
		Character[] sch = new Character[s.length()];
		Character[] tch = new Character[t.length()];
		for(int i=0;i<s.length();i++) {
			sch[i] = s.charAt(i);
		}
		for(int i=0;i<t.length();i++) {
			tch[i] = t.charAt(i);
		}
		Arrays.sort(sch);
		Arrays.sort(tch,Collections.reverseOrder());
		s = makeString(sch);
		t = makeString(tch);
		if(s.compareTo(t)<0) System.out.println("Yes");
		else System.out.println("No");
	}
	
	public static String makeString(Character[] c) {
		StringBuilder s = new StringBuilder();
		for(int i=0;i<c.length;i++) {
			s.append(c[i]);
		}
		return new String(s);
	}
	// 数字->頻度のmap 数字>頻度　→　-頻度　　数字＜頻度　→　ー（頻度ー数字）
	public static void C(Scanner sc) {
		int N = sc.nextInt();
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		int sum = 0;
		for(int i=0;i<N;i++) {
			int in = sc.nextInt();
			if(map.containsKey(in)) map.put(in,map.get(in)+1);
			else map.put(in,1);
		}
		for(int i : map.keySet()) {
			if(i>map.get(i)) sum += map.get(i);
			if(i<map.get(i)) sum += map.get(i)-i;
		}
		System.out.println(sum);
	}
}