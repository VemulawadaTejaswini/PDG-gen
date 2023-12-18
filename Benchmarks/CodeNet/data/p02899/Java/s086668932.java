import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		final class Num {
			public int no;
			public int comeOrder;
			
			public Num(int no, int comeOrder) {
				this.no = no;
				this.comeOrder = comeOrder;
			}
			
			public int getNo() { return no; }
			public int getOrder() { return comeOrder; }
		}
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		List<Num> student = new ArrayList<>();
		
		for (int i = 0; i < N; ++i) {
			student.add(new Num(i + 1, Integer.parseInt(sc.next())));
		}
		
		// sort
		student.sort(Comparator.comparingInt(Num::getOrder));
		
		// out
		for (int i = 0; i < N; ++i) {
			System.out.print(student.get(i).no + " ");
		}
		
	}

}
