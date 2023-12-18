import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		char[] cs=s.toCharArray();
		System.out.println(Slime(cs));
	}

	private static int Slime(char[] cs) {
		int r=1;
		for(int i=1;i<cs.length;i++) {
			if(cs[i-1]!=cs[i]) {
				r++;
			}
		}

		return r;
	}

}
