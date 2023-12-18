
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main (String[] args)  {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int a = sc.nextInt();
		Pair[] monster = new Pair[n];

		ArrayList<Integer> hitPos = new ArrayList<>();
		ArrayList<Long> hitSum = new ArrayList<>();
		
		hitSum.add(0L);

		for (int i=0;i<n;i++) {
			Pair p = new Pair();
			p.left =sc.nextInt();
			p.right =(sc.nextInt()-1)/a+1;
			monster[i]=p;
		}
		Arrays.sort(monster, Comparator.comparing((Pair p)->p.left));

		for (int i=0;i<n;i++) {
			int tmp = Collections.binarySearch(hitPos, monster[i].left-d);
			long damage = 0;
			if (tmp>=0) {
				damage = hitSum.get(hitSum.size()-1)-hitSum.get(tmp);
			} else {
				damage = hitSum.get(hitSum.size()-1)-hitSum.get(-tmp-1);
			}
			if (monster[i].right-damage>0) {
				hitPos.add(monster[i].left+d);
				hitSum.add(hitSum.get(hitSum.size()-1)+monster[i].right-damage);
			}
		}
		System.out.println(hitSum.get(hitSum.size()-1));
	}
	
}

class Pair {
	int left;
	long right;
}