import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[][] array = new String[100][500];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		int k = sc.nextInt();
		int x = sc.nextInt();

		list.add(x);

		for(int i=1;k>i;i++) {
			list.add(x-i);
		}

		for(int i=1;k>i;i++) {
			list.add(x+i);
		}

		Collections.sort(list);

		for(int i=0;list.size()>i;i++) {
			System.out.print(list.get(i));
			if((i+1)!=list.size()) {
				System.out.print(" ");
			}
		}

	}

}