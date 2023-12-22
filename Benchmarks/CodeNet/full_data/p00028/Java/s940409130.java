import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);
	
	int[] count=new int[101];
	public void run() {
		while (sc.hasNext()) {
			int m=sc.nextInt();
			count[m]++;
		}
		int max=0;
		for(int i=0;i<=100;i++){
			if(max>count[i])max=count[i];
		}
		for(int i=0;i<=100;i++){
			if(max==count[i])ln(i);
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