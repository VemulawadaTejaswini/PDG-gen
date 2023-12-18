import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		//List<Integer> list=new ArrayList<Integer>();
		//int[] array = new int[2000000];
		String s = sc.next();
		List<String> list=new ArrayList<String>(Arrays.asList(s.split("")));
		if(list.get(2).equals(list.get(3))){
			if(list.get(4).equals(list.get(5)))
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		else
			System.out.println("No");

	}
}