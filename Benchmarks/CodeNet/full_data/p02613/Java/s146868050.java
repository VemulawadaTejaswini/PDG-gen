import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		List<String> list = new ArrayList<String>();
		for (int i = 0 ; i < N;i++) {
			list.add(scan.next());
		}
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;
		for (int i=0;i<list.size();i++) {
			if(list.get(i).equals("AC")) {
				c1++;
			}else if(list.get(i).equals("WA")) {
				c2++;
			}else if(list.get(i).equals("TLE")) {
				c3++;
			}else if(list.get(i).equals("RE")) {
				c4++;
			}
		}
		System.out.println("AC x "+c1);
		System.out.println("WA x "+c2);
		System.out.println("TLE x "+c3);
		System.out.println("RE x "+c4);
	}

}
