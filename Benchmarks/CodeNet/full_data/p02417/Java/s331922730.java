import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main{

	static Scanner s=new Scanner(System.in);

	public static void main(String __[]){
			input();
			solve();
	}

	static String in;
	private static void input(){
		in=s.nextLine().toLowerCase().replaceAll("[^a-z]","");
	}

	private static void solve(){
		Counter<Character> counter = new Counter<>(30);
		for(char c='a';c<='z';c++)
			counter.add(c,0);
		for(char c:in.toCharArray())
			counter.add(c);
		for(Entry<Character, Integer> e:counter.map.entrySet())
			System.out.printf("%c : %d\n",e.getKey(),e.getValue());
	}
}

class Counter<T> {
	public HashMap<T, Integer> map;
	public Counter(int initSize) {
		map = new HashMap<>(initSize);
	}
	public Counter() {
		this(10);
	}
	public void add(T key, int v) {
		Integer i;
		if((i=map.get(key))==null) {
			map.put(key, v);
		}else {
			map.put(key, i+v);
		}
	}
	public void add(T key) {
		add(key,1);
	}
}