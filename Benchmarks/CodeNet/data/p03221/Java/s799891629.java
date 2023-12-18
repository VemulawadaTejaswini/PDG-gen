import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int p = scanner.nextInt() + 1;
		int counter = scanner.nextInt();
		
		ArrayList<Integer>[] arrayLists = new ArrayList[p];
		
		for(int i = 0;i<p;i++) {
			arrayLists[i]= new ArrayList<>(); 
		}
		StringBuilder builder = new StringBuilder();
		for(int i = 0;i<counter;i++) {
			int y = scanner.nextInt();
			int t = scanner.nextInt();
			arrayLists[y].add(t);
			builder.append(Integer.toString(y) + " " + Integer.toString(t) + " ");
		}
		
		for(int i = 0;i<p;i++) {
			if(arrayLists[i]!= null ) {
				Collections.sort(arrayLists[i]);
			}
		}
		
		String[] bb = builder.toString().split(" ");
		
		for(int i = 0;i<bb.length;i++) {
			if(i%2 == 0) {
				for(int j = 0;j<6-bb[i].length();j++) {
					System.out.print(0);
				}
				System.out.print(bb[i]);
			}else {
				String c = Integer.toString(arrayLists[Integer.parseInt(bb[i-1])].indexOf(Integer.parseInt(bb[i])) + 1);
				for(int j = 0;j<6-c.length();j++) {
					System.out.print(0);
				}
				System.out.println(c);
			}
		}
	}

}