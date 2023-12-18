import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main{
	public static void main(String[] arh) {
		Scanner sc=new Scanner(System.in);
		int kaisu=sc.nextInt();
		List<Integer> q=new ArrayList<Integer>();

		int uketori=0;
		for(int i=0; i<kaisu; i++) {
			uketori=sc.nextInt();
			if(q.size()==0) {
				q.add(uketori);
			}
			else {
				if(q.contains(uketori)) {
					q.remove(q.indexOf(uketori));
				}
				else {
					q.add(uketori);
				}
			}
		}
		System.out.println(q.size());
	}
}