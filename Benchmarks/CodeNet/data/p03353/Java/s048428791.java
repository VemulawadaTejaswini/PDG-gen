
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		SortedSet<String> set = new TreeSet<String>();

		for(int i=0; i<s.length(); i++) {
			for(int j=i; j-i<k && j<s.length(); j++){
				set.add(s.substring(i,j+1));
			}
		}

		int j=1;
		for(String ss : set) {
			if(k==j) {
				System.out.println(ss);
				break;
			}
			j++;
		}
		sc.close();
	}
}
