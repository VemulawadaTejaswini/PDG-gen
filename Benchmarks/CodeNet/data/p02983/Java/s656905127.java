import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//String[] array = new String[h+1];
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		List<Integer> list=new ArrayList<Integer>();
		int n = sc.nextInt();
		int d = sc.nextInt();

		for(int i=n;d>i;i++) {
			int a = i*(i+1);
			list.add(a%2019);
		}

		System.out.println(Collections.min(list));
	}
}
