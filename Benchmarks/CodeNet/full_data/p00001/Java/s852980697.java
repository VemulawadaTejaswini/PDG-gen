import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0 ; i<10 ;i++){
			int a = sc.nextInt();
			list.add(a);
		}
		
		Collections.sort(list);
		
		System.out.println(list.get(9));
		System.out.println(list.get(8));
		System.out.println(list.get(7));
		
		
	}

}