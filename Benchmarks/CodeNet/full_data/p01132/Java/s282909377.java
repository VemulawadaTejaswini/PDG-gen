import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean f = true;
		while(true) {
			int a = stdIn.nextInt();
			if(a == 0) break;
			
			if(!f) {
				System.out.println();
			}
			else {
				f = false;
			}
			int N10 = stdIn.nextInt();
			int N50 = stdIn.nextInt();
			int N100 = stdIn.nextInt();
			int N500 = stdIn.nextInt();
			int c = 0;
			c += N10;
			c += N50;
			c += N100;
			c += N500;
			
			int ans10 = 0;
			int ans50 = 0;
			int ans100 = 0;
			int ans500 = 0;
			for(int i = 0; i <= N10; i++) {
				for(int j = 0; j <= N50; j++) {
					for(int k = 0; k <= N100; k++) {
						for(int l = 0; l <= N500; l++) {
							if(i*10 + j * 50 + k * 100 + l * 500 < a) {
								break;
							}
							else {
								int ret = (i*10 + j * 50 + k * 100 + l * 500)- a;
								int p = 0;
								p += ret/500;
								ret -= ret/500 * 500;
								p += ret/100;
								ret -= ret/100 * 100;
								p += ret/50;
								ret -= ret/50 * 50;
								p += ret/10;
								ret -= ret/10 * 10;
								
								p += N10 - i;
								p += N50 - j;
								p += N100 - k;
								p += N500 - l;
								
								
								if(p < c) {
									c = p;
									ans10 = i;
									ans50 = j;
									ans100 = k;
									ans500 = l;
								}
							}
						}
					}
				}
			}
			System.out.print((ans10 == 0)?"":"10 " + ans10+"\n");
			System.out.print((ans50 == 0)?"":"50 " +ans50+"\n");
			System.out.print((ans100 == 0)?"":"100 "+ans100+"\n");
			System.out.print((ans500 == 0)?"":"500 " + ans500+"\n");
		}
		
	}
}