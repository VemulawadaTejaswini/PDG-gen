import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int a = sc.nextInt();
		//List<Integer> check=new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		List<Integer> list=new ArrayList<Integer>();
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);

		int n = sc.nextInt();

		for(int i=0;n>i;i++) {
			int a = sc.nextInt();
			list.add(a);
		}

		List<Integer> list_max=new ArrayList<Integer>();

		for(int i=0;n>i;i++) {
			int max =0;

			for(int j=0;n>j;j++) {
				if(i==j)
					continue;
				if(list.get(j)>max) {
					max = list.get(j);
				}

			}
			list_max.add(max);
		}

		for(int i=0;list_max.size()>i;i++) {
			System.out.println(list_max.get(i));
		}

	}

}
