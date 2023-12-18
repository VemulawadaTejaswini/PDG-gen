import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (scan.hasNext()){
			list.add(scan.nextInt());
		}
		int result = 0;
		Collections.sort(list);
		for (int i = 0; i < list.size();i++){
			int wk = 0;
			boolean fl = true;
			for (int j = 0; j < i; j ++){
				wk = wk + list.get(j);
			}
			for (int k = i; k < list.size(); k ++){
				if (wk * 2 >= list.get(k + 1)) {
					wk = wk + list.get(k + 1);
				} else {
					fl = false;
					break;
				}
			}
			if (fl){
				result = list.size() - i;
				break;
			}
		}
		System.out.println(result);
	}
}
