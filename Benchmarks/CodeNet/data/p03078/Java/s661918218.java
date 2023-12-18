import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<Long> a;
	static List<Long> b;
	static List<Long> c;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int k = sc.nextInt();
		a = new ArrayList<>(x);
		b = new ArrayList<>(y);
		c = new ArrayList<>(z);
		for(int i =0; i < x; i++)
			a.add(sc.nextLong());
		for(int i = 0; i < y; i++)
			b.add(sc.nextLong());
		for(int i = 0; i < z; i++)
			c.add(sc.nextLong());
//		Collections.sort(a);
//		Collections.sort(b);
//		Collections.sort(c);
//		Collections.reverse(a);
//		Collections.reverse(b);
//		Collections.reverse(c);
		
		List<Long> list = new ArrayList<>();
		for(long i : a)
			for(long j : b)
				list.add(i + j);
		Collections.sort(list);
		Collections.reverse(list);
		if(list.size() > k)
			list = list.subList(0, k);
		
		List<Long> result = new ArrayList<>();
		for(long l : list) 
			for(long i : c)
				result.add(l+i);
		Collections.sort(result);
		Collections.reverse(result);
		for(int i = 0; i < k; i++)
			System.out.println(result.get(i));
	}
}