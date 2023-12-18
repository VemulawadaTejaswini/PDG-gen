
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = Integer.parseInt(sc.next());
		int w = Integer.parseInt(sc.next());
		
		int []alp = new int [26];
		
		for(int i = 0 ; i < h ;i++) {
			String s = sc.next();
			for(int j = 0 ; j < w ;j++) {
				int m = s.charAt(j) - 'a';
				alp[m]++;
			}
		}
		
		int m1 = 0;
		int m2 = 0;
		int m4 = h*w;
		
		if(h % 2 == 1 && w % 2 == 1) {
			m1 = 1;
			m2 = h + w - 2;
			m4 -= m2 + m1;
		}
		else if(h % 2 ==1) {
			m1 = 0;
			m2 = w;
			m4 -= m2 + m1;
		}
		else if(w % 2 == 1) {
			m1 = 0;
			m2 = h;
			m4 -= m1 + m2;
		}
		
		for(int i = 0 ; i < m1 ;i++) {
			for(int j = 0 ; j < 26 ;j++) {
				if(alp[j] % 2 == 1) {
					alp[j]--;
					break;
				}
			}
		}
		while(m2 > 0) {
			boolean jdg = false;
			for(int i = 0 ; i < 26 ;i++) {
				if(alp[i] % 4 == 2) {
					jdg = true;
					alp[i] -= 2;
					m2 -= 2;
					break;
				}
			}
			if(!jdg) break;
		}
		
		while(m4 > 0) {
			boolean jdg = false;
			for(int i = 0 ; i < 26 ;i++) {
				if(alp[i] % 4 == 0 && alp[i] != 0) {
					jdg = true;
					alp[i] -= 4;
					m4 -= 4;
					break;
				}
			}
			if(!jdg)break;
		}
		
		int cnt = 0;
		
		for(int i = 0 ; i < 26 ;i++) {
			if(alp[i] % 4 != 0) {
				System.out.println("No");
				return;
			}
			if(alp[i] % 4 == 0 && alp[i] != 0) {
				cnt += alp[i];
			}
		}
		System.out.println((cnt == m2)? "Yes" : "No");
	}
}