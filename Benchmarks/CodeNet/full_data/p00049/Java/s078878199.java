import java.util.*;
public class Main{
	
	private void doit(){
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 0);
		map.put("B", 0);
		map.put("O", 0);
		map.put("AB", 0);
		while(sc.hasNext()){
			String [] a = sc.next().split(",");
			map.put(a[1], map.get(a[1]) + 1);
		}
		System.out.println(map.get("A"));
		System.out.println(map.get("B"));
		System.out.println(map.get("AB"));
		System.out.println(map.get("O"));
	}
	
	public static void main(String [] args){
		new Main().doit();
	}
}