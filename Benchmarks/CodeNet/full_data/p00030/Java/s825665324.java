import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
 public static void main(String[] args) {
	Set<Set<Integer>> all = new HashSet<Set<Integer>>();
	Map<Integer, Map<Integer, Integer>> map = new HashMap<Integer, Map<Integer, Integer>>();
	for (int i = 0; i < 10; i++) {
	 map.put(i + 1, new HashMap<Integer, Integer>());
	 Set<Integer> a = new HashSet<Integer>();
	 a.add(i);
	 all.add(a);
	}
	for (int i = 0; i < 10; i++) {
	 Set<Set<Integer>> set2 = new HashSet<Set<Integer>>();
	 for (Set<Integer> b : all) {
		Set<Integer> bb = new HashSet<Integer>(b);
		bb.add(i);
		set2.add(bb);
	 }
	 all.addAll(set2);
	}
	for (Set<Integer> cc : all) {
	 int val = 0;
	 for (int aa : cc) {
		val += aa;
	 }
	 int count = 1;
	 Map<Integer, Integer> map2 = map.get(cc.size());
	 if (map2.containsKey(val)) {
		count += map2.get(val);
	 }
	 map2.put(val, count);
	}

	Scanner in = new Scanner(System.in);
	boolean endFlag = false;
	int n = in.nextInt();
	int s = in.nextInt();
	while (!endFlag) {
	 Integer integer = map.get(n).get(s);
	 if(integer==null){integer=Integer.valueOf(0);}
	 System.out.println(integer);
	 n = in.nextInt();
	 s = in.nextInt();
	 if (n == 0 && s == 0) {
		endFlag = true;
	 }
	}
 }
}