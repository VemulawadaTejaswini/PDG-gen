import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0046().doIt();
	}
	
	class AOJ0046{
		void doIt(){
			ArrayList<Double> list = new ArrayList<Double>();
			while(in.hasNext())list.add(in.nextDouble());
			Collections.sort(list);
			System.out.println(Math.abs(list.get(0)-list.get(list.size()-1)));
		}
	}
	
}