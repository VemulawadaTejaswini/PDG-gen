import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {
	
	class Tree {
		String s;
		
		public Tree(String s) {
			this.s = s;
		}
		
		int parse() {return parse(s);}
		
		int parse(String str) {
			LinkedList<Integer> list = new LinkedList<Integer>();
			boolean flag = false;
			for(int i=1; i<str.length(); i++) {
				int j=i+1;
				if(j >= str.length()) break;
				int cnt = 1;
				for(; j<str.length(); j++) {
					if(str.charAt(j) == '[') cnt++;
					if(str.charAt(j) == ']') cnt--;
					if(cnt == 0) break;
				}
				if(str.charAt(i) == '[') {
					
					String sub = str.substring(i,j+1);
					if(sub.charAt(1) != '[') flag = true;
					list.add(parse(sub));
					
				} else {
					String sub = str.substring(i,j);
					list.add(Integer.parseInt(sub));
				}
				i=j;
			}
			if(list.size() == 1) return list.get(0);
			Collections.sort(list);
			int n = list.size()/2 + 1;
			int sum = 0;
			for(int i=0; i<n; i++) {
				int e = list.pollFirst();
				if(flag) {
					sum += e/2 + 1;
				} else {
					sum += e;
				}
				
			}
			return sum;
		}
	}
	
	public Main() {
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()) {
			int n = scanner.nextInt();
			for(int i=0; i<n; i++) {
				String s = scanner.next();
				int result = new Tree(s).parse();
				System.out.println(result);
			}
			break;
		}
		scanner.close();
	}
	
	public static void main(String[] args) {
		new Main();
	}

}