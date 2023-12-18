import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int Q = Integer.parseInt(sc.next());
		for(int i=0;i < Q;i++) {
			if(Integer.parseInt(sc.next()) == 1) {
				S = hanten(S);
			}  else {
				if(Integer.parseInt(sc.next())==1) {
					S = sc.next() + S;
				} else {
					S = S + sc.next();
				}
			}
		}
		System.out.println(S);
	}


	public static String hanten(String s) {
		String a ="";
		for(int i=s.length();i>0;i--) {
			a += s.substring(i-1,i);
		}
		return a;
	}
}
