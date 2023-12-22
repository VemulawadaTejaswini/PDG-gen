import java.awt.*;
import java.awt.geom.*;
import java.io.*;

import java.util.*;
class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			if(n == 0) break;
			int m = sc.nextInt();
			char[] s = sc.next().toCharArray();
			int count = 0;
			for (int i = 0; i < m; i++) {
				if(s[i] == 'I') {
					int len = 0;
					for (int j = 1; j + i < m; j++) {
						if (j % 2 == 1) {
							if (s[i + j] != 'O') {
								i = j + i - 1;
								len = j;
								break;
							}
						} else {
							if (s[i + j] != 'I') {
								len = j;
								i = j + i - 1;
								break;
							}
						}
						if(j + i == m-1) {
							len = j;
							i = j + i - 1;
							break;
						}
					}
					while (len >= 3 && len / 2 >= n) {
						len -= 2;
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}