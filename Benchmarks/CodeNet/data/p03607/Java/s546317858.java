import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<N; i++) {
			int A = in.nextInt();
			if(list.contains(A)) {
				list.remove(list.indexOf(A));
			}else {
				list.add(A);
			}
		}
		System.out.println(list.size());
		
		in.close();
	}
}
