import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int h = stdIn.nextInt();
			int w = stdIn.nextInt();
			if(h == 0 && w == 0) break;
			int diagonal = h * h + w * w;
			int mindiag = 999999999;
			int minh = 99999999;
			int minw = 99999999;
			for(int i = 1; i <= 150; i++) { //h
				for(int j = i+1; j <= 150; j++) { //w
					int diag = i * i + j * j;
					if(diag >= diagonal) {
						if(diag == diagonal && h >= i) {
							continue;
						}
						if(mindiag > diag) {
							mindiag = diag;
							minh = i;
							minw = j;
						}
					}
				}
			}
			System.out.println(minh + " " + minw);
		}
	}
}