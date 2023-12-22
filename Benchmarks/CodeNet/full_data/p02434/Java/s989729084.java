import java.util.Scanner;
import java.util.Vector;

class Main {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Vector<Vector<Integer>> list = new Vector<>();

		int n = scan.nextInt();
		for(int i=0; i<n; i++) {
			list.add(new Vector<Integer>());
		}

		int count = scan.nextInt();

		for(int i=0; i<count; i++) {
			int query = scan.nextInt();
			int a = scan.nextInt();

			switch(query) {

			case 0:	//pushBack
				int b = scan.nextInt();
				list.get(a).add(b);

				break;

			case 1:	//dump
				if(!list.get(a).isEmpty()) {
					for(Integer j=0; j<list.get(a).size()-1; j++) {
						System.out.print(list.get(a).get(j) + " ");
					}
					System.out.println(list.get(a).get(list.get(a).size()-1));
//					for(Integer x : list.get(a)) {
//						System.out.print(x + " ");
//					}
//					System.out.println();
				}else
					System.out.println();
				
				break;

			case 2:	//clear
				list.get(a).clear();
				
				break;
			}
		}
	}
}

