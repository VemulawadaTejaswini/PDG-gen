import java.util.*;
public class Main {
	static String st;
	static String st2;
	static int flag = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N;i++) {
			if(i==0) {
				st2 = sc.next();
				st = st2.substring(0,1);
			}else {
				st = st2;
				st2 = sc.next();
			}
			if(st.substring(st.length()-1, st.length()).equals(st2.substring(0, 1))==true) {
			}else {
				System.out.println(st.substring(st.length()-1, st.length()));
				System.out.println(st2.substring(0, 1));
				flag = 1;
			}
		}
		if(flag == 0) {
			System.out.println("Yes");
		}else if(flag ==1) {
			System.out.println("No");
		}
	}
}
