import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = reader.nextInt();
		}
		HashSet<Integer> common = new HashSet<Integer>(), all = new HashSet<Integer>();
		HashSet<Integer> first = factors(arr[0]);
		common.addAll(first);
		all.addAll(first);
		boolean pc = true, sc = false;
		for (int i = 1; i < n; i++) {
			if (!pc && sc) {
				break;
			}
			int curr = arr[i];
			if (curr == 1) {
				sc = true;
			}
			else {
				HashSet<Integer> currFactors = factors(curr);
				if (pc) {
					for (int test: currFactors) {
						if (all.contains(test)) {
							pc = false;
							break;
						}
					}
					all.addAll(currFactors);
				}
				if (!sc) {
					ArrayList<Integer> remove = new ArrayList<Integer>();
					for (int test: common) {
						if (!currFactors.contains(test)) {
							remove.add(test);
						}
					}
					for (Integer toRem: remove) {
						common.remove(toRem);
					}
					if (common.size() == 0) {
						sc = true;
					}
				}
			}
		}
		if (pc) {
			System.out.println("pairwise coprime");
		}
		else if (sc) {
			System.out.println("setwise coprime");
		}
		else {
			System.out.println("not coprime");
		}
		
		reader.close();
		
//		HashSet<Integer> test = factors(1241);
//		for (Integer i: test) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
	}
	
	public static HashSet<Integer> factors(int n) {
		HashSet<Integer> ret = new HashSet<Integer>();
		int curr = 2;
		while (n % 2 == 0) {
			ret.add(2);
			n /= 2;
		}
		curr++;
		int stop = (int) Math.ceil(Math.sqrt(n));
		while (curr <= stop) {
			if (n % curr == 0) {
				while (n % curr == 0) {
					ret.add(curr);
					n /= curr;
				}
				stop = (int) Math.ceil(Math.sqrt(n));
			}
			curr += 2;
		}
		ret.add(n);
		return ret;
	}
	
	
	
	
	
}
