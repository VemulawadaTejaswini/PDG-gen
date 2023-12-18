import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		boolean ac[] = new boolean[n+1];
		long acc = 0;
		long wa = 0;
		for(int i=0; i<m; i++) {
			int p = sc.nextInt();
			String s = sc.next();
			if(s.equals("AC") && !ac[p]) {
				ac[p]=true;
				acc++;
			} else if(!ac[p]) {
				wa++;
			}
		}
		System.out.println(acc + " " + wa);
		sc.close();
	}
}
