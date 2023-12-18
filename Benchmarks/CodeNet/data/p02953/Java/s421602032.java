import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static boolean isSort(ArrayList<Integer> list){
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i) > list.get(i+1)) {
				return false;
			}
		}
		return true;
	}

	public static boolean Sort(ArrayList<Integer> list){
		ArrayList<Integer> temp = list;
		for(int i=0;i<list.size();i++) {
			for(int j=0;j<list.size();j++) {
				list.set(i,list.get(i)-1);
				if(isSort(list)) {
					return true;
				}
			}
			list = temp;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			list.add(sc.nextInt());
		}
		if(isSort(list)) {
			System.out.println("Yes");
		}else if(Sort(list)) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}


		sc.close();
	}

}
