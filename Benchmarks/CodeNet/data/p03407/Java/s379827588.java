import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main (String [] args){
		List <Integer> list = new ArrayList<Integer>();
		HashMap <Integer, Integer>hm = new HashMap<Integer, Integer>();
		int v1 = Integer.parseInt(sc.next());
		int v2 = Integer.parseInt(sc.next());		
		int v3 = Integer.parseInt(sc.next());
		String ans_str = "";
		if((v1+v2)>v3){
			ans_str = "Yes";
		}else{
			ans_str = "No";
		}
		System.out.println(ans_str);
		System.out.flush();
		sc.close();
	}
}