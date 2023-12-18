import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int q = Integer.parseInt(sc.next());
		List<String> first = new ArrayList<String>();
		List<String> last = new ArrayList<String>();
		
		int flip = 0;
		for(int i = 0 ; i < q ; i++) {
			int t = Integer.parseInt(sc.next());
			if(t == 1) {
				flip = flip ^ t;
			}else{
				int t2 = Integer.parseInt(sc.next());
				int index = 0;
				if(t2 == 1) {
					index = 0;
				}else {
					index = 1;
				}
				
				if(flip == 1) {
					if(index == 0) {
						index = 1;
					}else {
						index = 0;
					}
					
				}
				
				if(index == 0) {
					s = sc.next() + s;
				}else {
					s = s + sc.next();
				}
				
				
			}
			
			
		}
		
		String ans = s;
		if(flip == 1){
	         StringBuffer str = new StringBuffer(s);
	         ans = str.reverse().toString();
		}

		System.out.println(ans);
	}
}