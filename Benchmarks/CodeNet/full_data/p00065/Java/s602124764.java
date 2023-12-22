import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class Main{
	
	@SuppressWarnings("resource")
	public static void main(String[] args){
		//last month
		Map<Integer, Integer> last = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			if(line.equals("")) break;
			
			Scanner scstr = new Scanner(line).useDelimiter(",");
			int no = scstr.nextInt();
			last.merge(no, 1, (A, B) -> (A+1));
		}
		
		//this month
		Map<Integer, Integer> pre = new HashMap<>();
		while(sc.hasNextLine()) {
			String line = sc.nextLine();
			Scanner scstr = new Scanner(line).useDelimiter(",");
			int no = scstr.nextInt();
			pre.merge(no, 1, (A, B) -> (A+1));
		}

		//sort last month
		List<Integer> keyList = Arrays.asList(last.keySet().toArray(new Integer[last.size()]));
		keyList.sort((A, B) -> (A < B)? -1: (A == B)? 0: 1); 
		
		//output
		keyList.forEach(K -> {
			if(pre.containsKey(K)) System.out.println(K + " " + (last.get(K) + pre.get(K)));
		});
	}
	
}