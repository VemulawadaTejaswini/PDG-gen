import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] str = S.split("/");
		int y=Integer.parseInt(str[0]);
		int m=Integer.parseInt(str[1]);
		int d=Integer.parseInt(str[2]);
		if(m>=5) {
			System.out.println("TBD");
		}else {
			System.out.println("Heisei");
		}
	}
}