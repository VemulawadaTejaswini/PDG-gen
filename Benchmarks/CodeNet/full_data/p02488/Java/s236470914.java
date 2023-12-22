import java.util.ArrayList;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		ArrayList<String> input = new ArrayList<String>();
		setInputToList(n, input);
		System.out.println(getMinimumString(input));
	}
	
	private static void setInputToList(int n, ArrayList<String> list){
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < n; i++){
			list.add(scanner.next());
		}
	}
	
	private static String getMinimumString(ArrayList<String> list){
		String result = list.get(0);
		for(int i = 1; i < list.size(); i++){
			String target = list.get(i);
			if(result.compareTo(target) > 0){
				result = target;
			}
		}
		return result;
	}
}