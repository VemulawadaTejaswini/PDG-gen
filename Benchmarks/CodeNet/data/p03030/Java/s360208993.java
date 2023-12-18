import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		List<Rest> R = new ArrayList<Rest>();
		for(int i=0; i<N; i++) {
			String s = sc.next();
			int p = sc.nextInt();
			Rest r = new Rest(i,s,p);
			R.add(r);
		}
		Comparator<Rest> comparator = 
				Comparator.comparing(Rest::getName).thenComparing(Rest::getPoint, Comparator.reverseOrder());
		
		R.stream().sorted(comparator)
		.forEach(a ->
		System.out.println(a.getIndex()+1));
	}
}

class Rest {
	private int index;
	private String name;
	private int point;
	
	public Rest(int index, String name, int point) {
		this.index = index;
		this.name = name;
		this.point = point;
	}
	
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
}
