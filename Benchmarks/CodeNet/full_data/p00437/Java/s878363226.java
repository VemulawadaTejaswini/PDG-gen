import java.util.Scanner;
import java.util.*;
public class Main {
	static int[] ar;
	static int n;
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while (true) {
			int a = stdIn.nextInt();
			int b = stdIn.nextInt();
			int c = stdIn.nextInt();
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			boolean[] ar = new boolean[a];
			boolean[] br = new boolean[b];
			boolean[] cr = new boolean[c];
			int n = stdIn.nextInt();
			int[] acr = new int[n];
			int[] bcr = new int[n];
			int[] ccr = new int[n];
			boolean[] tfr = new boolean[n];
			for (int i = 0; i < n; i++) {
				int tmpa = stdIn.nextInt();
				int tmpb = stdIn.nextInt();
				int tmpc = stdIn.nextInt();
				int tf = stdIn.nextInt();
				acr[i] = tmpa - 1;
				bcr[i] = tmpb - a - 1;
				ccr[i] = tmpc - a - b - 1;
				if (tf == 1) {
					ar[tmpa - 1] = true;
					br[tmpb - a - 1] = true;
					cr[tmpc - a - b - 1] = true;
				}
				tfr[i] = (tf == 1) ? true : false;
			}
			int[] aans = new int[a];
			for (int i = 0; i < a; i++) {
				aans[i] = 2;
			}
			int[] bans = new int[b];
			for (int i = 0; i < b; i++) {
				bans[i] = 2;
			}
			int[] cans = new int[c];
			for (int i = 0; i < c; i++) {
				cans[i] = 2;
			}
			for (int i = 0; i < n; i++) {
				if (ar[acr[i]] && br[bcr[i]] && !cr[ccr[i]]) {
					cans[ccr[i]] = 0;
					aans[acr[i]] = 1;
					bans[bcr[i]] = 1;
				}
				if (ar[acr[i]] && !br[bcr[i]] && cr[ccr[i]]) {
					aans[acr[i]] = 1;
					bans[bcr[i]] = 0;
					cans[ccr[i]] = 1;
				}
				if (!ar[acr[i]] && br[bcr[i]] && cr[ccr[i]]) {
					aans[acr[i]] = 0;
					bans[bcr[i]] = 1;
					cans[ccr[i]] = 1;
				}

			}
			for (int i = 0; i < a; i++) {
				System.out.println(aans[i]);
			}
			for (int i = 0; i < b; i++) {
				System.out.println(bans[i]);
			}
			for (int i = 0; i < c; i++) {
				System.out.println(cans[i]);
			}
		}
		
		
	}

	

}