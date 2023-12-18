import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		StringBuilder s = new StringBuilder(in.nextLine());
		int q = in.nextInt();
//		System.out.println("Q: "+q);
		for(int i=0; i<q; i++) {
			int op = in.nextInt();
//			System.out.println("op: "+op);
			if(op==1) {
				s.reverse();
			}else if(op==2) {
				int position = in.nextInt();
//				System.out.println("position: "+position);
				char c = in.next().charAt(0);
//				System.out.println("c: "+c);
				if(position==1) {
					s.insert(0, c);
				}else if(position==2) {
					s.append(c);
				}
			}
		}
		System.out.print(s);
		}
	
}
