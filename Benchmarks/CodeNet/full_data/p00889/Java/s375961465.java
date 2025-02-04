import java.util.*;

public class Main{
	
	private void doit(){
		
	}

	private void debug(Object... o) {
		System.out.println("debug = " + Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			int s = sc.nextInt();
			int w = sc.nextInt();
			int q = sc.nextInt();
			if((n|s|w|q) == 0) break;
			char [] a = new char[n];
			for(int i = 0, g = s; i < n; i++){
				a[i] = (char) (((g / 7) % 10) + '0');
				if(g % 2 == 0){
					g = (g / 2);
				}
				else{
					g = (g / 2) ^ w;
				}
			}
			int ans = 0;
			if(q == 2 || q == 5){
				for(int i = 0, count = 0; i < n; i++){
					if( (int)(a[i] - '0') % q == 0){
						if((int)(a[i] - '0') != 0){
							count++;
						}
						ans += count;
					}
				}
			}
			else{
				int [] freq = new int[q + 1];
				freq[0] = 1;
				for(int i = n - 1, digitUp = 1, now = 0; i >= 0; i--){
					now = ((int)(a[i] - '0') * digitUp + now) % q;
					digitUp = (digitUp * 10) % q;
					if(a[i] != '0'){
						ans += freq[now];
					}
					freq[now]++;
				}
			}
			System.out.println(ans);
		}
	}
}