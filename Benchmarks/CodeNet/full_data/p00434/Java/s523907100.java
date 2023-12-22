import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0 ; i < 28 ; i++){
			int no = sc.nextInt();
			list.add(no);
			if(i == 27) {
				list.add(31);
				list.add(31);
			}
		}
		Collections.sort(list);
		for(int j = 1 ; j <= 30 ; j++){
			if (list.get(j-1) != j){
				System.out.println(j);
			}
		}
		
		sc.close();
	}

}