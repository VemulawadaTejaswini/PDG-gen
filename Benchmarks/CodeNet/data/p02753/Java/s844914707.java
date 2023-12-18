import java.util.*;


public class Main {

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.next();		
		
		char array[] = input.toCharArray();
		
		boolean existBus = false;
		if(array[0]!=array[1])
			existBus =true;
		else if(array[1]!=array[2])
			existBus =true;
		else if(array[0]!=array[2]) {
			existBus = true;
		}
				
		log( existBus ? "Yes" : "No");	
	}

}
