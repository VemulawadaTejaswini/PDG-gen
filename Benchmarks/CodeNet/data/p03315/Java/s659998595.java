
public class Main {

	public static void main(String[] args) {
		int number = 0;
		
		for (String a : args) {
			if (a.equals("+")) {
				number++;
			}else if (a.equals("-")) {
				number--;
			}
			
		}
		
		System.out.println(number);
		
		
		
		
	}

}
