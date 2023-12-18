import java.util.*;
public class Main {

	public static void main (String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		ArrayList<Integer> buttonList = new ArrayList<Integer>();
		
		buttonList.add(a);
		buttonList.add(b);
		
		boolean isFirst = true;
		Integer result = 0;
		for (int i = 0; i <= 1; ++i) {
			Integer max = Collections.max(buttonList);
			result = result + max;
			
		}
		
		System.out.println(result);
	
	}

}