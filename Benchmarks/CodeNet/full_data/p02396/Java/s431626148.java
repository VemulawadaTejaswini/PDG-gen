
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		 while(sc.hasNext()) {
			int inputNum = sc.nextInt();
			if(inputNum != 0) {
				list.add(inputNum);
			}
			if(inputNum == 0) {
				break;
			}
		 }
		int index =1;
		for(int i : list) {
			System.out.println("case "+index+": "+i);
			index++;
		}
	}
}