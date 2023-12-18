import java.io.*;
import java.util.*;
import java.util.function.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer in = new StringTokenizer("");
		int n=Integer.parseInt(br.readLine());
		in=new StringTokenizer(br.readLine());
		Map<Integer,Integer> mp=new HashMap<>();
		Consumer<Integer> add_mp=(it)->mp.put(it, mp.getOrDefault(it, 0)+1);
		Consumer<Integer> subtract_mp=(it)->mp.put(it, mp.getOrDefault(it, 0)-1);
		for(int i=0;i<n;i++)add_mp.accept(Integer.parseInt(in.nextToken()));
		int m=Integer.parseInt(br.readLine());
		in=new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++)subtract_mp.accept(Integer.parseInt(in.nextToken()));
		mp.values().forEach(it->{
			if(it<0){
				System.out.println("NO");
				System.exit(0);
			}
		});
		System.out.println("YES");
	}
}

class Pair<T extends Comparable<T>, U extends Comparable<U>> implements Comparable<Pair<T, U>> {
	public T first;
	public U second;

	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public int compareTo(Pair<T, U> ob) {
		if (first.compareTo(ob.first) != 0) return first.compareTo(ob.first);
		else return second.compareTo(ob.second);
	}
}