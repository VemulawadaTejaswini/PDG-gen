import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			String[] str = sc.nextLine().split("[//s]+");
			
			list.add(Integer.parseInt(str[1]));
			map.put(Integer.parseInt(str[1]), Integer.parseInt(str[0]));
		}
		 Collections.sort(list);
		
		System.out.println(map.get(list.get(n - 1)) + " " + list.get(n - 1));
		
		sc.close();
	}
}