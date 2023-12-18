import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c[] = s.toCharArray();
		int couA=0;
int couB=0;
		for (int i = 0; i < c.length; i++) {
			if (i % 2 == 0) {
				if(c[i]=='0'){couA++;}
			} else {
				if(c[i]!='0'){couA++;}
			}
		}
		for (int i = 0; i < c.length; i++) {
			if (i % 2 != 0) {
				if(c[i]=='0'){couB++;}
			} else {
				if(c[i]!='0'){couB++;}
			}
		}
	System.out.println(Math.min(couA, couB));
	}
}