import java.util.*;

public class Main{
	int N;
	Scanner reader = new Scanner(System.in);
	public static void main(String[]args) {
		 Main p = new Main();
		 p.run();
	}

	public void run() {
		N = reader.nextInt();
		String s = reader.next();
		if(s.length()<=N)
			System.out.print(s);
		else
			System.out.print(s.substring(0,N)+"...");
	}
}
