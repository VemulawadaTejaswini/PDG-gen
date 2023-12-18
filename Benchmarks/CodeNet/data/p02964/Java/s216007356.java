import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//int a = sc.nextInt();
		//List<Integer> check=new ArrayList<Integer>();
		//array = new int[h+1][w+1];
		List<String> list=new ArrayList<String>();
		//List<String> list= new ArrayList<String>(Arrays.asList(s.split("")));
		//Collections.reverse(list);
		int n = sc.nextInt();
		long k = sc.nextLong();

		for(int i=0;n>i;i++) {
			String a = sc.next();
			list.add(a);
		}

		List<String> list_move=new ArrayList<String>();
		for(int i=0;k>i;i++) {
			for(int j =0;n>j;j++) {
				if(i==0&&j==0) {
					list_move.add(list.get(j));
					continue;
				}
				while(true) {
					int length = list_move.size();
					if(list_move.contains(list.get(j))) {
						list_move.remove(length-1);
					}
					else {
						list_move.add(list.get(j));
						break;
					}
					if(list_move.size()==0)
						break;
				}

			}
		}

		for(int i=0;list_move.size()>i;i++) {
			System.out.print(list_move.get(i));
			if(i!=list_move.size()-1) {
				System.out.print(" ");
			}
		}
		//System.out.println(list_move);

	}

}
