import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static List<List<Integer>> ptnList = new ArrayList<>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		List<Person> personList = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			Person p = new Person();
			for(int j = 0; j < a; j++) {
				int x = sc.nextInt();
				int y = sc.nextInt();
				p.evidenceList.add(new Evidence(x, y));
			}
			personList.add(p);
		}

		int max = 0;

		countfor: for(int count = 0; count < Math.pow(2,  n); count++) {

			String b = Integer.toBinaryString(count);
			String ptn = "";
			for(int i = 0; i < n - b.length(); i++) {
				ptn += "0";
			}
			ptn += b;

			for(int i = 0; i < personList.size(); i++) {
				if(ptn.charAt(i) == '1') {
					for(Evidence e : personList.get(i).evidenceList) {
						if(Integer.parseInt(ptn.substring(e.x - 1, e.x)) == e.y){

						}else {
							continue countfor;
						}
					}
				}
			}

			int c = 0;
			for(int i = 0; i < ptn.length(); i++) {
				if(ptn.charAt(i) == '1') {
					c++;
				}
			}
			if(c > max) {
				max = c;
			}

		}

		System.out.println(max);


		sc.close();



	}

	private static class Person {
		List<Evidence> evidenceList = new ArrayList<>();
	}

	private static class Evidence {
		int x;
		int y;

		public Evidence(int _x, int _y) {
			this.x = _x;
			this.y = _y;
		}
	}
}
