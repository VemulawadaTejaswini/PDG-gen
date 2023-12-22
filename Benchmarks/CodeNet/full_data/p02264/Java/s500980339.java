import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Processees {
	private String name;
	private int time;

	public String getName() {
		return name;
	}

	public int getTime() {
		return time;
	};

	public void setTime(int time) {
		this.time = time;
	}

	public Processees(String name, int time) {
		this.name = name;
		this.time = time;
	}

}


public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int p = scanner.nextInt();

		Deque<Processees> Processeeses = new ArrayDeque<Processees>(n);
		for (int i = 0; i < n; i++) {
			Processeeses.add(new Processees(scanner.next(), scanner.nextInt()));
		}
		int totalTime =0;
		int tempTime;
		while(Processeeses.size()!=0){
			if(Processeeses.element().getTime()<=p){
				totalTime+=Processeeses.element().getTime();
				System.out.println(Processeeses.element().getName()
						+ " "+totalTime);
				Processeeses.poll();
			}
			else{
				tempTime = Processeeses.element().getTime()-p;
				Processeeses.element().setTime(tempTime);
				Processeeses.add(Processeeses.element());
				Processeeses.poll();
				totalTime+=p;
			}
		}

	}
}