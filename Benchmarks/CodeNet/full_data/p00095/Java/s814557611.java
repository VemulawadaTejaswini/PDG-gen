import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int top = 0,
				temp = 0;
			Map map = new HashMap<Integer,Integer>();
			
			for(int  i = 0; i < n; i++){
				int key = sc.nextInt();
				map.put(key, sc.nextInt());
				if(top <= (int) map.get(key)){
					top = (int)map.get(key);
					temp = key;
				}
			}
			System.out.println(temp + " " + map.get(temp));
		}
	}
}