import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>(); 
		
		for(int i = 0; i < r; i++) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int j = 0; j < c; j++) {
				list.add(scan.nextInt());
			}
			lists.add(list);
		}
		
		int temp = 0;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < c; j++) {
				temp += lists.get(i).get(j);
			}
			lists.get(i).add(temp);
			temp = 0;
		}
		
		ArrayList<Integer> list_kari = new ArrayList<Integer>();
		int tempForAll = 0;
		for(int i = 0; i < c; i++) {
			for(int j = 0; j < r; j++) {
				temp += lists.get(j).get(i);
			}
			list_kari.add(temp);
			tempForAll += temp;
			temp = 0;
		}
		list_kari.add(tempForAll);
		lists.add(list_kari);
		
		for(int i = 0; i < r + 1; i++) {
			for(int j = 0; j < c + 1; j++) {
				if(j == 0) System.out.print(lists.get(i).get(j));
				else System.out.print(" " + lists.get(i).get(j));
			}
			System.out.println();
		}
		
	}

}

