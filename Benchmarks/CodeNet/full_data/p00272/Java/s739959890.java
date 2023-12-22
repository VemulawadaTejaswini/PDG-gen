import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0277();
	}
	
	class AOJ0277{
		public AOJ0277() {
			int[] tickets = new int[4];
			int[] kane = {6000,4000,3000,2000};
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<4;i++){
				list.add(in.nextInt()-1);
				tickets[list.get(list.size()-1)] = in.nextInt();
			}
			for(int i=0;i<list.size();i++)System.out.println(kane[list.get(i)]*tickets[list.get(i)]);
		}
	}
}