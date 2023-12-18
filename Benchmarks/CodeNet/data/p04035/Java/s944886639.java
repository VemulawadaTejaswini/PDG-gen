import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l= sc.nextInt();
		int a[] = new int[n];
		long tot = 0;
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
			tot+=a[i];
		}
		int lef = 1;
		int rig = n-1;
		boolean work = true;
		ArrayList<Integer> ret = new ArrayList<>();
		while(lef<=rig) {
			if(tot<l) {
				work = false;
				break;
			}
			if(a[lef-1]<a[rig]) {
				tot-=a[lef-1];
				ret.add(lef);
				lef++;
			}
			else {
				tot-=a[rig];
				ret.add(rig);
				rig--;
			}
		}
		if(work) {
			System.out.println("Possible");
			for(int x : ret) {
				System.out.println(x);
			}
		}
		else {
			System.out.println("Impossible");
		}
	}
}
