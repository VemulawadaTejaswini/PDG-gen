import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	static Map<String,Integer> dayMap = new HashMap<String, Integer>() {{
		put("SUN", 7);
		put("SAT", 1);
		put("FRI", 2);
		put("THU",3);
		put ("WED",4);
		put("TUE", 5);
		put("MON",6);
	}};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dayStr = sc.nextLine();
		sc.close();
		System.out.println(dayMap.get(dayStr));
	}

}