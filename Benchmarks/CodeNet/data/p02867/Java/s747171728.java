import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list_a=new ArrayList<Integer>();
		List<Integer> list_b=new ArrayList<Integer>();
		//Integer[] array = new Integer[m];
		int n = sc.nextInt();
		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list_a.add(a);
		}
		for(int i=0;n>i;i++) {
			int b = sc.nextInt();
			list_b.add(b);
		}
		Collections.sort(list_a);
		Collections.sort(list_b);
		for(int i=0;n>i;i++) {
			if(list_a.get(i)>list_b.get(i)) {
				System.out.println("No");
				System.exit(0);
			}
		}


		System.out.println("No");
	}
}