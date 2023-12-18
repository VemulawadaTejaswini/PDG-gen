
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		ArrayList<String> set = new ArrayList<String>();

		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++){
				set.add(s.substring(i,j+1));
			}
		}
		Collections.sort(set);

		int j=1;
		String prev = "";
		for(String ss : set) {

			if(k==j) {
				System.out.println(ss);
				break;
			}
			if(prev.equals(ss)) {
				continue;
			}
			prev=ss;
			j++;
		}
		sc.close();
	}
}
