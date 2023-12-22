import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		String str;
		int c;
		int mc = 0;
		String fre = "";
		String max = "";
		
		while(scan.hasNext()){
			str = scan.next();
			
			if(max.length() < str.length())max = str;
			if(m.containsKey(str)){
				c = m.get(str);
				if(mc < c+1){
					mc = c+1;
					fre = str;
				}
				m.put(str, c+1);
			}
			else{
				if(mc < 1){
					mc = 1;
					fre = str;
				}
				m.put(str, 1);
			}
		}
		System.out.println(fre + " " + max);
	}
}