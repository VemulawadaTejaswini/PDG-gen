import java.util.*;
public class Main{
	public void output(){
		Scanner scan = new Scanner(System.in);
		int[] hito = new int[1000];

		int p = 0;
		int g = 0;
		int taihi = 0;
		while(true){
			int n = scan.nextInt();
			if(n == 0)break;
			int yama = 0;
			int ba = 0;
			for(int r = 0;r < n;r++){
				hito[r] = 0;
			}
			String huda1 = scan.next();
			char[] huda = huda1.toCharArray();
			for(int i = 0; i < 100; i++){
				/*if(p == n-1){
					p = 0;
				}*/
				p = i % n;
				if(huda[yama] == 'M'){
					hito[p] = hito[p] + 1;
				}
				if(huda[yama] == 'S'){
					hito[p] = hito[p] + 1;
					ba = ba + hito[p];
					hito[p] = 0;
				}
				if(huda[yama] == 'L'){
					hito[p] = hito[p] + 1;
					hito[p] = hito[p] + ba;
					ba = 0;
				}
				yama = yama + 1;
			}
			for(int u = 0; u < n-1; u++){
				for(int t = n-1; t > u;t--){
					  if(hito[t]<hito[t-1]){
					  taihi = hito[t];
					  hito[t] = hito[t-1];
					  hito[t-1]=taihi;
					  }
				}
			}
			for(g = 0; g < n;g++){
				System.out.print(hito[g] + " ");
			}
			System.out.println(ba);
		}
	}
}