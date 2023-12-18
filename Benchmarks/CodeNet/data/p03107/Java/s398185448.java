import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		StringBuilder s = new StringBuilder().append(sc.nextLine());

		System.out.println(remove(s,0));
	}

	public static int remove(StringBuilder s,int ans) {

		boolean flag = false;
		StringBuilder s2 = new StringBuilder();

		for(int i=0;i<s.length()-1;i++) {

			if(s.substring(i, i+2).equals("01") ||
			   s.substring(i, i+2).equals("10")) {
				s2 = s.delete(i, i+2);
				flag = true;
				break;
			}
		}

		if(flag) {
			return remove(s2,ans+2);
		}else {
			return ans;
		}
	}

}