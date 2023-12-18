import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int nb[] = new int[32];
		
		int nn = n<0 ? -n:n;
		for(int i=0;nn>0;i++){
			nb[i] = nn & 1;
			nn >>= 1;
		}
		
		int ans[] = new int[256];
		for(int i = 0;i<32;i+=2){
			if(n>=0){
				if(nb[i] == 1 && nb[i+1] == 0)
					ans[i]++;
				else if(nb[i] == 0 && nb[i+1] == 1){
					ans[i+1]++;
					ans[i+2]++;
				}
				else if(nb[i] == 1 && nb[i+1] == 1){
					ans[i]++;
					ans[i+1]++;
					ans[i+2]++;
				}
			}
			else{
				if(nb[i] == 1 && nb[i+1] == 0){
					ans[i]++;
					ans[i+1]++;
				}
				else if(nb[i] == 0 && nb[i+1] == 1){
					ans[i+1]++;
				}
				else if(nb[i] == 1 && nb[i+1] == 1){
					ans[i]++;
					ans[i+2]++;
					ans[i+3]++;
				}
			}
		}
		
		for(int i =0;i<250;i++){
			while(ans[i] >= 2){
				ans[i]-=2;
				ans[i+1]++;
				ans[i+2]++;
			}
		}
		
		int p = 255;
		while(p >0 && ans[p] == 0){
			p--;
		}
		for(int i=p;i>=0;i--){
			System.out.print(ans[i]);
		}
	}

}
