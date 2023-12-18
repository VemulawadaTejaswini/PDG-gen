import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> valueList = new ArrayList(); 

		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			valueList.add(value);
		}
		Collections.sort(valueList);
		
		int provisionalMaxNumber = 0;
		List<Integer> list = new ArrayList(); 
		for(int i = 1; i < valueList.get(valueList.size()-1); i++) {
			for(int value :valueList) {
				if(value % i != 0) {
					list.add(value);
				}
				if(list.size() >= 2) {
					list.clear();
					break;
				}
				if(value == valueList.get(valueList.size()-1)) {
					provisionalMaxNumber = i;
				}
			}
			
			


			
		}
		
		
		System.out.println(provisionalMaxNumber);

		
		
	}	

}

