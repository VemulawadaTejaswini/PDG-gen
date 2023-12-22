import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		int a[] = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		ArrayList<Integer> al =new ArrayList<Integer>();
		ArrayList<Integer> al1 =new ArrayList<Integer>();
		al.add(1);
		int i=0;
		for(;;) {
			if(al.contains(a[i])) {
				al.add(a[i]);
				break;
			}
			al.add(a[i]);
			i=a[i]-1;
		}
		int j=0;
		for(j=al.size()-2;j>=0;j--) {
			if(al.get(j)==al.get(al.size()-1)) {
				break;
			}
		}
		for(i=0;i<al.size()-j;i++) {
			al1.add(al.get(j+i));
		}
		if(k>al.size()) {
			k=k-(long)j;
			long mod = k%(long)(al1.size()-1);
			System.out.println(al1.get((int)mod));
		}
		else {
			System.out.println(al.get((int)k));
		}
	}
}
