import java.util.*;
import java.math.*;
import java.awt.geom.*;
import java.io.*;
      
      
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int W = sc.nextInt();
			int Q = sc.nextInt();
			if(W == 0 && Q == 0) break;
			int[] list = new int[W];
			boolean[] use = new boolean[W];
			for(int i = 0; i < Q; i++) {
				char in = sc.next().charAt(0);
				if(in == 's') {
					int id = sc.nextInt();
					int w  = sc.nextInt();
					boolean ok = false;
					int b = 0;
					for(int j = 0; j < W; j++) {
						boolean check = true;
						for(int k = 0; k < w; k++) {
							if(j + k >= W) {
								check = false;
								break;
							}
							if(use[j + k]) {
								check = false;
								break;
							}
						}
						if(!check) continue;
						ok = true;
						b = j;
						for(int k = 0; k < w; k++) {
							use[j + k] = true;
							list[j + k] = id;
						}
						break;
					}
					if(!ok) {
						System.out.println("impossible");
					}
					else {
						System.out.println(b);
					}
				}
				if(in == 'w') {
					int id = sc.nextInt();
					for(int j = 0; j < W; j++) {
						if(use[j] && list[j] == id) {
							use[j] = false;
						}
					}
				}
			}
			System.out.println("END");
		}
	}
 }