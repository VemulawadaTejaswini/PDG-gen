import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws Exception {
		new Main().run();
	}
	
	void run() {
		Scanner sc=new Scanner(System.in);
		char[] n=sc.next().toCharArray();
		boolean flag=true;
		int s=0;
		int t=n.length-1;
		while(t-s>0) {
			flag&=n[s]==n[t];
			++s;
			--t;
		}
		System.out.println(flag?"Yes":"No");
	}
	
	static void tr(Object... objects) {
		System.out.println(Arrays.deepToString(objects));
	}
	
}
