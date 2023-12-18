import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> listACTG = new ArrayList<String>();
		listACTG.add("A");
		listACTG.add("C");
		listACTG.add("G");
		listACTG.add("T");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.next();
		int maxCount = 0;
		int tmpCount = 0;
		for (int i = 0 ; i < line.length() ; i++) {
	        if(listACTG.contains(line.substring(i,i+1))) {
	        	tmpCount ++;
	        }else {
	        	tmpCount = 0;
	        }
			if(tmpCount >=maxCount) {
				maxCount = tmpCount;
			}
		}
		System.out.println(maxCount);
		scanner.close();
	}
}