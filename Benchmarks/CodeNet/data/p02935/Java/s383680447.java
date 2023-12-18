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
		List<Double> list=new ArrayList<Double>();

		double n = sc.nextInt();

		for(int i=0;n>i;i++) {
			double a = sc.nextInt();
			list.add(a);
		}

		Collections.sort(list);
		double answer=0;

		for(int i=0;n-1>i;i++) {
			answer=(list.get(0)+list.get(1))/2;
			list.remove(0);
			list.remove(0);
			list.add(answer);
			Collections.sort(list);
			//System.out.println(list);
		}

		System.out.println(list.get(0));
		}

}