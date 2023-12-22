import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double max = Integer.MIN_VALUE,
			   min = Integer.MAX_VALUE,
			   tmp;
		
		while(sc.hasNext()) {
			tmp = sc.nextDouble();
			max = Math.max(max, tmp);
			min = Math.min(min, tmp);
		}
		
		System.out.println(max - min);

	}
}