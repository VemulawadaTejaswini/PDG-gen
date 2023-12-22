import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		ArrayList l1 = new ArrayList<Integer>();
		ArrayList l2 = new ArrayList<Integer>();
		
		for(int i = 0; i<n;i++) {
			l1.add(sc.nextInt());
		}
		
		for(int i = 0; i<m;i++) {
			l2.add(sc.nextInt());
		}
		
		int c = 0;

		while(true) {
			if(l1.size() == 0) {
				if(l2.size() != 0 && (int)l2.get(0) <= k) {
					c+=1;
					k-= (int)l2.get(0);
					l2.remove(0);
				} else {
					break;
				}
			} else if(l2.size() == 0) {
				if(l1.size() != 0 && (int)l1.get(0) <= k) {
					c+=1;
					k-= (int)l1.get(0);
					l1.remove(0);
				} else {
					break;
				}
			} else if((int)l1.get(0)<(int)l2.get(0)) {
				if((int)l1.get(0) <= k) {
					c+=1;
					k-=(int)l1.get(0);
					l1.remove(0);
				} else {
					break;
				}
			} else {
				if((int)l2.get(0) <= k) {
					c+=1;
					k-=(int)l2.get(0);
					l2.remove(0);
				} else {
					break;
				}
			}
		}
		System.out.println(c);
	}
}