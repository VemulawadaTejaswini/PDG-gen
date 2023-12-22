import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int W, H, x, y, r;
	    try (Scanner sc = new Scanner(System.in)) {
	    	W = sc.nextInt();
	    	H = sc.nextInt();
	    	x = sc.nextInt();
	    	y = sc.nextInt();
	    	r = sc.nextInt();
	    }

	    if (x-r < 0 || x+r > W) {
	    	System.out.println("No");
	    }

	    else if (y-r < 0 || y+r > H) {
	    	System.out.println("No");
	    }
	    else {
	    	System.out.println("Yes");
	    }
	}

}

