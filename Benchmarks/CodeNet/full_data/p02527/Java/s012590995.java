//\[g·évOiÌlÍ1,000,000Èºj
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<Integer> set = new TreeSet<Integer>();
		TreeMap<Integer,Integer> map = new TreeMap<Integer, Integer>();

		for(int i=0; i < n; i++){
			int temp = sc.nextInt();
			if( set.contains(temp)){
				if(map.containsKey(temp)){
					map.put(temp, map.get(temp) + 1);
				}
				else{
					map.put(temp, 1);
				}
			}
			else{
				set.add(temp);
			}
		}
		for(int num: set){
			if(map.containsKey(num)){
				for(int i=0; i < map.get(num);i++){
					System.out.print(num + " ");
				}
			}
			if(num == set.last()){
				System.out.println(num);
			}
			else{
				System.out.print(num + " ");
			}

		}

	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}