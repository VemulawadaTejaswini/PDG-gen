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
		
		List<Long> ab = new ArrayList<>();
		for(long i : a)
			for(long j : b)
				ab.add(i + j);
		
		Collections.sort(ab);
		Collections.reverse(ab);
		
		List<Long> abc = new ArrayList<>();
		
		for(int i = 0; i < Math.min(k, ab.size()); i++) 
			for(long l : c)
				abc.add(ab.get(i) + l);
		Collections.sort(abc);
		Collections.reverse(abc);
		
		for(int i = 0; i < k; i++)
			System.out.println(abc.get(i));
	}
}