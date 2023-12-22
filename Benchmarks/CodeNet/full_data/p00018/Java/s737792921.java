import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		String[] str = sc.nextLine().split("[\\s]");
		int i = 0;
		
		for(String r:str){
			int tmp = Integer.parseInt(r);
			list.add(tmp);
			if(i == 4)
				break;
			i++;
		}
		
		Collections.sort(list);
		Collections.reverse(list);
		
		for(int j = 0;;j++){
			System.out.print(list.get(j));
			if(j == 4)
				break;
			System.out.print(" ");
		}
	}
}