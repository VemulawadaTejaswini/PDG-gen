import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();

		List<Character> list = new ArrayList<Character>();

		list.add('A');
		list.add('C');
		list.add('G');
		list.add('T');

		int max = 0;
		
		for(int i = 0; i < s.length(); i++){
			for(int j = 0; j < s.length(); j++){
				if(((i + 1) + j) <= s.length()){
					String str = s.substring(j, ((i + 1) + j));
					//System.out.println(str);
					
					int count = 0;
					for(int k = 0; k < str.length(); k++) {
						if(list.contains(str.charAt(k))) {
							if(k == count) {
								if(max < k) {
									max = k;
								}
							}
							count++;
						}else{
							break;
						}
					}
				}
			}
		}
		
		System.out.println(max+1);

	}
}