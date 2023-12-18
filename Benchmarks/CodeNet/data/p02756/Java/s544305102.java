


import java.util.Scanner;



public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder(sc.next());
		int q = sc.nextInt();
		boolean rev = false;
		for (int i=0;i<q;i++) {
			int a = sc.nextInt();
			if (a==1) {
				rev = !rev;
			} else {
				int f = sc.nextInt();
				String c = sc.next();
				if (f==1 || rev) {
					s.insert(0,c);
				} else {
					s.append(c);
				}
			}
		}
		if (rev) {
			s.reverse();
		}
		
		System.out.println(s);



	
	}
	


}



