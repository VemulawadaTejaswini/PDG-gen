import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String[] sa = new String[n];
		boolean flag = true;
		
		sa[0] = sc.next();
		for (int i = 1; i < n; i++) {
			sa[i] = sc.next();
			int j = sa[i-1].length() - 1;
			if (!(sa[i].charAt(0) == sa[i-1].charAt(j)))
				flag = false;
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i+1; j < n; j++) {
				if ((sa[i].equals(sa[j])))
					flag = false;
			}
		}
		
		System.out.println(flag == true ? "Yes" : "No");
	}
}