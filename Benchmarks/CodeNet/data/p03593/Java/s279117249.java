
import java.util.Scanner;

public class Main{
	
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
		
		int m1 = (h % 2 == 1 && w % 2 == 1)?1:0;
		int m2 = ((h % 2 == 1)? w : 0)+ ((w % 2 == 1) ? h : 0); 
		m2 -= m1;
		
		if(m1 == 1) {
			for(int i = 0 ; i < 26 ;i++) {
				if(alp[i] % 2 == 1) {
					alp[i]--;
					break;
					}
				}
			}
		int m3 = (h*w - m2 - m1)/4;
		for(int i = 0 ; i < m3 ;i++) {
			f: for(int j = 0 ; j < 26 ;j++) {
				if(alp[i] % 4 == 0 && alp[i] != 0) {
					alp[i] -= 4;
					break f;
				}
			}
		}
		
		int cnt = 0;
		for(int i = 0 ; i < 26;i++) {
			if(alp[i] % 2 == 1) {
				System.out.println("No");
				return;
			}
			
			if(alp[i] % 4 == 2) {
				cnt += alp[i]/2; 
			}
		}
		
		System.out.println(cnt <= m2 ? "Yes" : "No");
		}
	}