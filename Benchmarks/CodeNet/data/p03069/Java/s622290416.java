import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		String s = sc.next();
		String[] stones = s.split("");
		int reverse = n;
		for(int black=0;black<=n;black++) {
			int tmpReverse = 0;
			for(int j=0;j<n;j++) {
				if(j<=n-black) {
					if(stones[j].equals("#")) {
						tmpReverse++;
					}
				}else {
					if(stones[j].equals(".")) {
						tmpReverse++;
					}
				}
			}
			if(reverse>tmpReverse) {
				reverse = tmpReverse;
			}
		}

		System.out.println(reverse);
	}
}
