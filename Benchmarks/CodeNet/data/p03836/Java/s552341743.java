import java.util.Scanner;

public class Main {
	
	static int sx;
	static int sy;
	static int tx;
	static int ty;
	
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		 sx = Integer.parseInt(sc.next());
		 sy = Integer.parseInt(sc.next());
		
		 tx = Integer.parseInt(sc.next());
		 ty = Integer.parseInt(sc.next());
		 
		 first();
		 second();
		 
		 String ans = sb.toString();
		 System.out.println(ans);
		
	}
	
	static void first() {
		int l = ty - sy;
		int w = tx - sx;
		
		int temp = 0;
		
		while(temp <= 1) {
		for(int i = 0 ; i < l ; i++) {
			if(temp == 0) {
				sb.append('U');
			}
			else {
				sb.append('D');
			}
		}
		for(int i = 0 ; i < w ; i++) {
			if(temp == 0) {
				sb.append('R');
			}
			else {
				sb.append('L');
			}
		}
		temp++;
	}
}
	
	static void second() {
		int l = ty - sy;
		int w = tx - sx;
		
		int temp = 0;
		
		while(temp <= 1) {
			if(temp == 0) {
				sb.append('L');
			}
			else {
				sb.append('R');
			}
		for(int i = 0 ; i <= l ; i++) {
			if(temp == 0) {
				sb.append('U');
			}
			else {
				sb.append('D');
			}
		}
		for(int i = 0 ; i <= w ; i++) {
			if(temp == 0) {
				sb.append('R');
			}
			else {
				sb.append('L');
			}
		}
		if(temp == 0) {
			sb.append('D');
		}
		else {
			sb.append('U');
		}
		
		temp++;
	}

	}

}
