import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean hantenFlg = true;
		int Q = Integer.parseInt(sc.next());
		for(int i=0;i < Q;i++) {
			if(Integer.parseInt(sc.next()) == 1) {
				hantenFlg = hantenFlg ? false: true;
			}  else {
				if(Integer.parseInt(sc.next())==1) {
					if(hantenFlg) {
						S = sc.next() + S;
					} else {
						S = S + sc.next();
					}
				} else {
					if(hantenFlg) {
						S = S + sc.next();
					} else {
						S = sc.next() + S;
					}
				}
			}
		}
		if(!hantenFlg) {
			S = hanten(S);
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