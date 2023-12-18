import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean j = true;
		String a[] = new String[n];

		for(int i=0;i<n;i++) {
			a[i] = sc.next();
			for(int k=0;k<i;k++) {
				if(a[i].equals(a[k])) {
					j = false;
				}
			}
		}

		int t=0;
		String s;

		for(int i=0;i<n-1;i++) {
			t=a[i].length();
			s = a[i].substring(t-1, t);
			if(s.equals(a[i+1].substring(0, 1))) {

			}else {
				j = false;
			}
		}

		if(j) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}




	}
}