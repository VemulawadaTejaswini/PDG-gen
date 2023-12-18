import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Dubious Document 2
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		String t = scan.next();
		scan.close();

		char sc[]=s.toCharArray();
		char st[]=t.toCharArray();


		int check=0;
		int check_i=0;
		for(int i=0;i<s.length();i++) {
			if(st[0]==sc[i]) {
				if(sc.length-i<st.length) {
					check=1;
					break;
				}
				else {
					check_i=i;
					break;
				}
			}
		}

		if(check==1)System.out.println("UNRESTORABLE");
		else {
			int cnt=1;
			for(int i=0;i<s.length();i++) {
				if(check_i<=i && i< check_i + t.length()) {
					if(sc[i]=='?') {
						sc[i]=st[cnt];
						cnt+=1;
					}
				}else if(sc[i]=='?') {
					sc[i]='a';
				}
			}
			for(int i=0;i<s.length();i++) {
				System.out.print(sc[i]);
			}
			System.out.println();
		}

	}

}