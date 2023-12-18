import java.util.*;

public class Main {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		Main soln = new Main();
		System.out.println((soln.jd(m,n))? "Yes":"No");
	}

	private boolean jd(int m, int n) {
		if(m==2 || n==2) return false;
		return (grp(m)*grp(n)>0)? true:false;
	}

	private int grp(int k) {
		if(k==4 || k==6 || k==9 || k==11) return 1;
		else return -1;
	}
}