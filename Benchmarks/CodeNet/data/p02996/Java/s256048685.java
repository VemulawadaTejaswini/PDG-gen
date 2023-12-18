import java.util.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
//		int[] a = new int[n];
//		int[] b = new int[n];
//		int[] c = new int[n];
		int a,b;
		ArrayList<Ab> ablist = new ArrayList<>(n);
		for(i=0;i<n;i++) {
			a = Integer.parseInt(sc.next());
			b = Integer.parseInt(sc.next());
//			c[i] = b[i] - a[i];
			ablist.add(new Ab(a, b));
		}
		sc.close();
		ablist.sort((x, y) -> x.b-y.b);
		String ans = "Yes";
		long asum = 0;
		long bsum = 0;
		for(i=0;i<ablist.size();i++) {
			asum += ablist.get(i).a;
			bsum = ablist.get(i).b;
//			System.out.printf("a,b=%d,%d",asum,bsum);
			if(asum > bsum) {
				ans = "No";
				break;
			}
		}
		System.out.println(ans);
	}
}
class Ab {
	int a;
	int b;
//	int c;
	public Ab(int a, int b) {
		this.a = a;
		this.b = b;
//		this.c = b-a;
	}
}
