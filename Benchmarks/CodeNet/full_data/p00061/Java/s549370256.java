
import java.util.*;

public class Main {

	private void doit() {
		Scanner sc = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		while(true){
			String [] input = sc.next().split(",");
			if(input[0].equals("0")){
				break;
			}
			map.put(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}
		TreeSet<Integer> t = new TreeSet<Integer>();
		for(int key: map.keySet()){
			t.add(map.get(key));
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : t){
			list.add(i);
		}
		
		while(sc.hasNext()){
			int in = sc.nextInt();
			int num = map.get(in);
			int ind = -1;
			for(int i = 0; i < list.size(); i++){
				if(num == list.get(i)){
					ind = list.size() - i;
					break;
				}
			}
			System.out.println(ind);
		}
		
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}