import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0049().doIt();
	}
	
	class AOJ0049{
		void doIt(){
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			map.put("A", 0);
			map.put("B", 0);
			map.put("AB",0);
			map.put("O", 0);
			while(in.hasNext()){
				String[] input = in.next().split(",");
				map.put(input[1],map.get(input[1])+1);
			}
			System.out.println(map.get("A"));
			System.out.println(map.get("B"));
			System.out.println(map.get("AB"));
			System.out.println(map.get("O"));
		}
	}
	
	
	
}