import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(in.hasNext())new AOJ0031().doIt();
	}
	class AOJ0031{
		void doIt(){
			int n = in.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>(); 
			for(int i=0;i<10;i++){
				if((n>>i)%2==1)list.add(1<<i);
			}
			System.out.print(list.get(0));
			for(int i=1;i<list.size();i++)System.out.print(" "+list.get(i));
			System.out.println();
		}
	}
}