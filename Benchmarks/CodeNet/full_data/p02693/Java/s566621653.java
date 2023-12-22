import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean ok=false;
		for(int i=a; i<=b; i++) {
			if(i%k==0) {
				ok=true;
			}
		}
		if(ok) {
			System.out.println("OK");
		}else {
			System.out.println("NG");
		}
		sc.close();
	}


}