import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double array[] = new double[num];
		for(int i = 0; i < num; i ++) {
			array[i] = (double)sc.nextLong();
		}
		TreeSet<Double> max = new TreeSet<>();
		Map<Double, Integer> a = new HashMap<>();
		for(int i = 0; i < num; i ++) {
			if(max.lower(array[i]) != null) {
				max.remove(max.lower(array[i]));
			}
			if(max.contains(array[i])) {
				if(a.containsKey(array[i])) {
					int tmp = a.get(array[i]) + 1;
					a.replace(array[i], tmp);
					max.add(array[i] + 1.0 / tmp);
				}else {
					a.put(array[i], 2);
					max.add(array[i] + 1.0 / 2);
				}
			}else {
				max.add(array[i]);
			}
		}
		System.out.println(max.size());
	}
}