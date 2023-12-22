import java.util.Scanner;

public class Main {
	void run(){
		Scanner s = new Scanner(System.in);
		int sec  = s.nextInt();
	    int m = 0;
	    int h = 0;
	    m= sec / 60;
	    sec = sec - m * 60;
	    h = m / 60;
	    m = m - h * 60;
	    System.out.println(h + ":" + m + ":" + sec);
	}
	public static void main(String[] args) {
		
		new Main().run();
		
	}
}