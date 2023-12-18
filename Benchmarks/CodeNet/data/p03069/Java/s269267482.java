import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String s = sc.next();
		int sum = 0;
		String[] strs = s.split("");
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<strs.length; i++) {
			if(strs[i].equals("#")) {
				list.add(i);
			}else {
				continue;
			}
		}
		if(list.size()==0) {
			System.out.println(sum);
			return;
		}else {
			int last = list.size()-1;
			if(list.get(last) != strs.length-1) {
				for(int i=0; i+1<list.size(); i++) {
					sum += (list.get(i+1) - list.get(i) - 1);
				}
				sum += (strs.length - list.get(last)-1);
			}else {
				for(int i=0; i+1<list.size(); i++) {
					sum += (list.get(i+1) - list.get(i) - 1);
				}
			}
		}
		System.out.println(sum);
	}
}
