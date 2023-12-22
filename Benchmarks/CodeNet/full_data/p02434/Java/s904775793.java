import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Main{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			int q = sc.nextInt();

			@SuppressWarnings("unchecked")
			Vector<Integer>[] A = new Vector[n];
			for(int i=0;i<n;i++) {
				A[i] = new Vector<>();
			}

			for(int i=0;i<q;i++) {
				int query = sc.nextInt();
				int t = sc.nextInt();
				switch(query) {
				case 0:
					A[t].add(sc.nextInt());
					break;
				case 1:
					Iterator<Integer> LI = A[t].iterator();
					if(LI.hasNext()) {
						System.out.print(LI.next());
						while(LI.hasNext()) {
							System.out.print(" " + LI.next());
						}
					}
					System.out.println();
					break;
				case 2:
					A[t].clear();
					break;
				}
			}
		}
	}
}
