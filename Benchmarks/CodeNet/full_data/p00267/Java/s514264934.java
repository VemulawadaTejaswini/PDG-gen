import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n==0) {
				break;
			}
			LinkedList<Integer> a = new LinkedList<Integer>();
			LinkedList<Integer> b = new LinkedList<Integer>();
			for(int i=0;i<n;i++) {
				a.add(sc.nextInt());
			}
			for(int i=0;i<n;i++) {
				b.add(sc.nextInt());
			}
			Collections.sort(a);
			Collections.sort(b);
			int win = 0;
			boolean flag = false;
			for(int i=0;i<n;i++) {
				if (a.getLast() > b.getLast()) {
					win++;
					a.removeLast();
					b.removeFirst();
				}else{
					a.removeLast();
					b.removeLast();
				}
				if (win>(i+1)/2.0) {
					System.out.println(i+1);
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("NA");
			}
		}
	}
}