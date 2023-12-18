import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] color = new int[n];
		for(int i = 0; i < n; i++) {
			color[i] = stdIn.nextInt();
		}
		int hai = 0;
		int tya = 0;
		int midori = 0;
		int mizuiro = 0;
		int aoiro = 0;
		int kiiro = 0;
		int daidaiiro = 0;
		int akairo = 0;
		
		int maxcnt = 0;
		int mincnt = 0;
		int mosa = 0;
		for(int i = 0; i < n; i++) {
			if(color[i]>= 1 && color[i] <= 399) {
				if(hai >= 1) {
					continue;
				}
				hai++;
			}else if(color[i] >= 400 && color[i] <= 799){
				if(tya >= 1) {
					continue;
				}
				tya++;

			}else if(color[i]>= 800 && color[i] <= 1199) {
				if(midori >= 1) {
					continue;
				}
				midori++;
				
			}else if(color[i]>= 1200 && color[i] <= 1599) {
				if(mizuiro >= 1) {
					continue;
				}
				mizuiro++;
			}else if(color[i]>= 1600 && color[i] <= 1999) {
				if(aoiro >= 1) {
					continue;
				}
				aoiro++;
			}else if(color[i]>= 2000 && color[i] <= 2399) {
				if(kiiro >= 1) {
					continue;
				}
				kiiro++;
			}else if(color[i]>= 2400 && color[i] <= 2799) {
				if(daidaiiro >= 1) {
					continue;
				}
				daidaiiro++;
			}else if(color[i]>= 2800 && color[i] <= 3199) {
				if(akairo >= 1) {
					continue;
				}
				akairo++;
			}else {
				mosa++; //3200以上の猛者を捕獲
			}
		}
		
		int min = hai + tya + midori + mizuiro + aoiro + kiiro + daidaiiro + akairo;
		if(min >= 1) {
			mincnt = min;
			maxcnt = min + mosa;
		}else {
			mincnt = 1;
			maxcnt = mosa;
		}
		
		System.out.print(mincnt+" "+maxcnt);
		
		
	}

}
