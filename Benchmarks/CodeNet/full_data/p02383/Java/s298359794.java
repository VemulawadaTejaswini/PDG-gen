import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class Main{
	static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main app = new Main();
		for(int i = 1 ; i <= 6 ; i++){
			map.put(i, sc.nextInt());
		}
		char temp [] = sc.next().toCharArray();
		for(int i = 0; i < temp.length; i++){
			app.rotate(String.valueOf(temp[i]));
		}
		System.out.println(map.get(1));
	}
	void rotate(String temp){
		Map <Integer,Integer> memo =  new HashMap<Integer,Integer>(map);
		
		switch(temp){
		case "E":
			map.put(1, memo.get(4));
			map.put(3, memo.get(1));
			map.put(6, memo.get(3));
			map.put(4, memo.get(6));
			break;
		case "W":
			map.put(1, memo.get(3));
			map.put(3, memo.get(6));
			map.put(6, memo.get(4));
			map.put(4, memo.get(1));
			break;
		case "N":
			map.put(1, memo.get(2));
			map.put(2, memo.get(6));
			map.put(6, memo.get(5));
			map.put(5, memo.get(1));
			break;
		case "S":
			map.put(1, memo.get(5));
			map.put(2, memo.get(1));
			map.put(6, memo.get(2));
			map.put(5, memo.get(6));
			break;
		}
	}
}