import java.util.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Map<Double, Integer> map = new TreeMap<Double,Integer>();
	static Map <Double, Integer>map2 = new TreeMap<Double, Integer>();
	static Map <Double, Integer>map3 = new TreeMap<Double, Integer>();
	static Map <Double, Integer>mapG = new TreeMap<Double, Integer>();
	static LinkedList<Double> list = new LinkedList<Double>();
	static LinkedList<Double> listG = new LinkedList<Double>();

	public static void main(String[] args) {
			read();
	}
	static void read(){
		int number = 0;
		double time = 0.0;
		for(int x = 0; x < 3; x++){
			for(int i = 0; i < 8; i++){
				number = sc.nextInt(); time = sc.nextDouble();
				map.put(time, number);
				list.add(time);
			}
			Collections.sort(list);
			time = list.getFirst();
			number = map.get(time);
			System.out.println(number + " " + time);
			list.remove(0);
			map.remove(time);
			number = map.get(list.getFirst());
			time = list.getFirst();
			System.out.println(number + " " + time);
			list.remove(0);
			map.remove(time);
			for(int i = 0; i < list.size(); i++){
				listG.add(list.get(i));
			}
			for(int i = 0; i < map.size(); i++){
				mapG.putAll(map);
			}
			list.remove();
			map.clear();
		}
		Collections.sort(listG);
		time = listG.getFirst();
		number = mapG.get(time);
		System.out.println(number + " " + time);
		listG.remove(0);
		mapG.remove(time);
		time = listG.getFirst();
		number = mapG.get(time);
		System.out.println(number + " " + time);
	}
}