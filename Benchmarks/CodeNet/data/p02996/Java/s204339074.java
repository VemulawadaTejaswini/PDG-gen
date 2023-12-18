import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		ArrayList<Work> works = new ArrayList<Work>();
		for(int i = 0; i < N; i++){
			works.add( new Work(scan.nextInt(), scan.nextInt()));
		}

		Collections.sort(works, new Comparator<Work>(){
			@Override
			public int compare(Work w1, Work w2) {
				return (w1.deadline - w2.deadline);
			}
		});
		
		int now = 0;
		boolean flag = true;
		for(int i = 0; i < N; i++){
			now += works.get(i).cost;
			if(now > works.get(i).deadline){
				flag = false;
				break;
			}
		}
		System.out.println(((flag)?"Yes":"No"));
		
	}

	public class WorkComparator implements Comparator<Work> {
		@Override
		public int compare(Work w1, Work w2) {
			return w1.cost < w2.cost ? -1 : 1;
		}
	}
}
class Work{
	int cost, deadline;
	Work(int x, int y){
		this.cost = x;
		this.deadline = y;
	}
}