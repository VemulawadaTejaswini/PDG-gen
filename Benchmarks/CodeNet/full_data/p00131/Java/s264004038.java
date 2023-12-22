import java.io.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			boolean[][] map = new boolean[10][10];
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					map[j][k] = (sc.nextInt() == 1)?true:false;
				}
			}
			
			IN:for(int j = 0; j < 1 << 10; j++) {
				boolean[][] cpMap = new boolean[10][10];
				boolean[][] faMap = new boolean[10][10];
				for(int k = 0; k < 10; k++) {
					cpMap[k] = Arrays.copyOf(map[k], 10);
				}
				for(int k = 0; k < 10; k++) {
					if((j & 1 << k) != 0) {
						faMap[0][k] = true;
						fa(cpMap,0,k);
					}
				}
				for(int k = 1; k < 10; k++) {
					for(int l = 0; l < 10; l++) {
						if(cpMap[k-1][l]) {
							fa(cpMap,k,l);
							faMap[k][l] = true;
						}
						if(k != 1 && cpMap[k-2][l]) {
							continue IN;
						}
					}
				}
				if(check(cpMap)) {
					show(faMap);
					break;
				}
			}
		}
	}
	public static void show(boolean[][] a) {
		for(int i = 0; i < 10; i++) {
			if(a[i][0]) {
				System.out.print(1);
			}
			else {
				System.out.print(0);
			}
			for(int j = 1; j < 10; j++) {
				if(a[i][j]) {
					System.out.print(" " + 1);
				}
				else {
					System.out.print(" " + 0);
				}
			}
			System.out.println();
		}
	}
	
	public static boolean check(boolean[][] a) {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(a[i][j]) return false;
			}
		}
		return true;
	}
	
	public static void fa(boolean[][] a, int b, int c) {
		a[b][c] = (a[b][c])?false:true;
		for(int i = 0; i < 4; i++) {
			if(fb(b + vy[i],c + vx[i])) {
				a[b + vy[i]][c + vx[i]] = (a[b + vy[i]][c + vx[i]])?false:true;
			}
		}
	}
	
	public static boolean fb(int b, int c) {
		if(b < 0 || c < 0 || b >= 10 || c >= 10) return false;
		return true;
	}
	
	static int[] vx = new int[] {1,0,-1,0};
	static int[] vy = new int[] {0,1,0,-1};
}