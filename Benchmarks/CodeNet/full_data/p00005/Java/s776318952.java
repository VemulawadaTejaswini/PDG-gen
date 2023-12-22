import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			int a = in.nextInt();
			int b = in.nextInt();
			int tmp = 0;
			boolean judge = false;
			for(int i=1; i<a; i++) {
				for(int j=1; j<b; j++) {
					if(a*i == b*j) {
						tmp = a*i;
						judge = true;
					}
					if(a*i < b*j) break;
				}
				if(judge) break;
			}
			judge = false;
			while(true) {
				int r = a%b;
				if(r==0) {
					System.out.println(b + " " + tmp);
					break;
				} else {
					a = b;
					b = r;
				}
			}
		}
	}
}