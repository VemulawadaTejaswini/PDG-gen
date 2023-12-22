import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static TreeMap map = new TreeMap();
	static TreeMap map2 = new TreeMap();
	static TreeMap map3 = new TreeMap();
	public static void main(String[] args) {
			read();
			solve();
	}
	static boolean read(){
		int number = 0;
		double time = 0.0;
		for(int i = 0; i < 8; i++){
			number = sc.nextInt(); time = sc.nextDouble();
			map.put(new Double(time), new Integer(number));
		}
		for(int i = 0; i < 8; i++){
			number = sc.nextInt(); time = sc.nextDouble();
			map2.put(new Double(time), new Integer(number));
		}
		for(int i = 0; i < 8; i++){
			number = sc.nextInt(); time = sc.nextDouble();
			map3.put(new Double(time), new Integer(number));
		}
		return true;

	}
	static void solve(){
		 System.out.print(map.firstEntry().getValue() + " ");
		 System.out.println(map.firstKey());
		 map.remove(map.firstKey());
		 System.out.print(map.firstEntry().getValue() + " ");
		 System.out.println(map.firstKey());
		 map.remove(map.firstKey());

		 System.out.print(map2.firstEntry().getValue() + " ");
		 System.out.println(map2.firstKey());
		 map2.remove(map2.firstKey());
		 System.out.print(map2.firstEntry().getValue() + " ");
		 System.out.println(map2.firstKey());
		 map2.remove(map2.firstKey());

		 System.out.print(map3.firstEntry().getValue() + " ");
		 System.out.println(map3.firstKey());
		 map3.remove(map3.firstKey());
		 System.out.print(map3.firstEntry().getValue() + " ");
		 System.out.println(map3.firstKey());
		 map3.remove(map3.firstKey());

		 map.putAll(map2);
		 map.putAll(map3);

		 System.out.print(map.firstEntry().getValue() + " ");
		 System.out.println(map.firstKey());
		 map.remove(map.firstKey());
		 System.out.print(map.firstEntry().getValue() + " ");
		 System.out.println(map.firstKey());
	}

}