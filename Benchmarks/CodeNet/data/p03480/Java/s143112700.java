import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		
		List<Integer> list = new ArrayList<>();
		int n = s.length();
		char c = s.charAt(0);
		int count = 1;
		for(int i=1;i<n;i++) {
			if(s.charAt(i)==c) count++;
			else {
				list.add(count);
				count = 1;
				c = s.charAt(i);
			}
		}
		list.add(count);
		if(list.size()==2) {
			System.out.println(Math.max(list.get(0), list.get(1)));
		}else {
			int w = (list.size()+1)/2;
			int sum = 0;
			for(int i=0;i<w;i++) {
				sum += list.get(i);
			}
			int min = sum;
			for(int i=w;i<list.size();i++) {
				min = Math.min(min, sum+list.get(i)-list.get(i-w));
			}
			System.out.println(min);
		}
	}

}
