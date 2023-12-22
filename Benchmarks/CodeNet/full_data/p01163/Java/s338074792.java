import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pm = 30000;
		boolean[] prime = new boolean[pm+1];
		for(int i=2;i<=pm;i++) prime[i] = true;
		for(int i=2;i<=pm+1;i++){
			for(int j=i+i;j<=pm;j+=i){
				prime[j]=false;
			}
		}
		int[] p = new int[3245];
		int cnt = 0;
		for(int i=2;i<=pm;i++){
			if(prime[i]){
				p[cnt] = i;
				cnt++;
			}
		}
		
		while(true){
			int t = sc.nextInt();
			if(t==0) break;
			
			cnt = 0;
			for(int i=0;i<3245;i++){
				if(p[i]>t) break;
				for(int j=i;j<3245;j++){
					if(p[i]+p[j]>t) break;
					int pp = t-p[i]-p[j];
					if(prime[pp] && pp>=p[j]){
						int[] a = new int[]{p[i], p[j], pp};
						Arrays.sort(a);
						if(a[0]+a[1]>a[2]) cnt++;
					}
				}
			}
			System.out.println(cnt);
		}	
	}
	
}