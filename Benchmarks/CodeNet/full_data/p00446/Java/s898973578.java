import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			boolean[] t = new boolean[2*n+1];
			boolean[] h = new boolean[2*n+1];
			Arrays.fill(h, true);
			h[0] = false;
			for(int i=0;i<n;i++){
				int tmp = stdIn.nextInt();
				t[tmp] = true;
				h[tmp] = false;
			}
			int tc = n;
			int hc = n;
			int f = 0;
			boolean turnT = true;
			boolean pay = false;
			while(true){
				pay = false;
				if(tc==0||hc==0){
					break;
				}
				if(turnT){
					for(int i=1;i<=2*n;i++){
						if(t[i]&&i>f){
							t[i] = false;
							tc--;
							pay = true;
							f = i;
							break;
						}
					}
					if(!pay){
						f = 0;
					}
					turnT = false;
				}
				else{
					for(int i=1;i<=2*n;i++){
						if(h[i]&&i>f){
							h[i] = false;
							hc--;
							pay = true;
							f = i;
							break;
						}
					}
					if(!pay){
						f = 0;
					}
					turnT = true;
				}			
			}
			int ts = 0;
			int hs = 0;
			for(int i=1;i<=2*n;i++){
				if(t[i]){
					ts++;
				}
				if(h[i]){
					hs++;
				}
			}
			System.out.println(hs);
			System.out.println(ts);
		}
	}
}