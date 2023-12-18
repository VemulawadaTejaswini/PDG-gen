
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

	Scanner sc = new Scanner(System.in);

	void run() {
		String s = sc.next();
		int k  = sc.nextInt();
		
		LinkedList<String> res = new LinkedList<String>();
		res.add(Character.valueOf((char)('z'+1))+"");
		res.add(Character.valueOf((char)('z'+1))+"");
		res.add(Character.valueOf((char)('z'+1))+"");
		res.add(Character.valueOf((char)('z'+1))+"");
		res.add(Character.valueOf((char)('z'+1))+"");

		for(int i = 0 ; i < s.length(); i++){
			
			for(int j = i; j < i+5 && j < s.length(); j++){
				
				String str = s.substring(i, j+1);
				
				int p = Collections.binarySearch(res, str);
					
				if(p >= 0 ){
					continue;
				}
				
				int ins = -p-1;
				res.add(ins,str);
				res.removeLast();
			}
		}
		
		System.out.println(res.get(k-1));
	}
}
