import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int arare = scn.nextInt();
		int count = 0;

		String[] arares = new String[arare];

		//各あられの色を配列に格納
		for(int i=0; i<arare; i++) {
				arares[i] = scn.next();
		}
		//配列をリストに変換
		List<String> listA=Arrays.asList(arares);

		//重複した値を削除
		List<String> listB = new ArrayList<String>(new HashSet<>(listA));


			for(int j=0; j<listB.size(); j++) {
				if(listB.contains("P"))
					count++;
				else if(listB.contains("W"))
					count++;
				else if(listB.contains("G"))
					count++;
				else if(listB.contains("Y"))
					count++;
			}
			if(count==3)
				System.out.println("Three");
			else
				System.out.println("Four");
	}
}
