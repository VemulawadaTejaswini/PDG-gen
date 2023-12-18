import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		String s = in.next();
		List<Integer> list = new ArrayList<>();
		char c = s.charAt(0);
		if(c=='0') list.add(0);
		int num = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=c) {
				list.add(num);
				c = s.charAt(i);
				num = 1;
			}else num++;
		}
		list.add(num);
		if(c=='0') list.add(0);
		
		if(2*k+1>=list.size()) {
			System.out.println(n);
		}else {
			int tmp = 0;
			int ans = 0;
			int i = 0;
			for(;i<2*k+1;i++) {
				tmp += list.get(i);
			}
			ans = tmp;
			for(;i<list.size();i+=2) {
				tmp = tmp + list.get(i) + list.get(i+1) - list.get(i-2*k-1) - list.get(i-2*k);
				ans = Math.max(ans, tmp);
			}
			System.out.println(ans);
		}
		in.close();
		
	}

}
