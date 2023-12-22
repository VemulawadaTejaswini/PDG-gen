import java.util.*;

//文字操作

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		int n=sc.nextInt();
		while(n--!=0){
			char[] val=sc.next().toCharArray();
			Arrays.sort(val);
			int min=Integer.parseInt(String.copyValueOf(val));
			char[] rev=new char[val.length];
			for(int i=0;i<rev.length;i++){
				rev[i]=val[rev.length-1 -i];
			}
			int max=Integer.parseInt(String.copyValueOf(rev));
			ln(max-min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}