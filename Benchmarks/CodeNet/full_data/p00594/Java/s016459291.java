import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		Loop : while((n = scan.nextInt())!=0){

			map.clear();

			for (int i = 0; i < n; i++) {
				int a = Integer.parseInt(scan.next());
				if(!map.containsKey(a)){
					map.put(a, 1);
				}else{
					map.put(a, map.get(a)+1);
				}
			}

			for(Map.Entry<Integer, Integer> e : map.entrySet()){
				if(e.getValue()>n/2){
					System.out.println(e.getKey());
					continue Loop;
				}
			}
			System.out.println("NO COLOR");
		}
	}
}