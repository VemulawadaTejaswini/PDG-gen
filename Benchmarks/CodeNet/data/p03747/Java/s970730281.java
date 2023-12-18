import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int t = sc.nextInt();
		int[] x = new int[n];
		int[] w = new int[n];
		for(int i=0; i<n; i++){
			x[i] = sc.nextInt();
			w[i] = sc.nextInt();
		}
		int count = 0;
		for(int i=1; i<n; i++){
			if(w[0]==1){
				if(w[i]==2){
					if((x[i]-x[0])/2<t){
						count++;
						if((2*t-x[i]+x[0])%l==0){
							count +=  (2*t-x[i]+x[0]-l)/l;
						}else{
							count +=  (2*t-x[i]+x[0])/l;
						}
					}
				}
			}else{
				if(w[i]==1){
					if((l-x[i]+x[0])/2<t){
						count--;
						if((2*t+x[i]-x[0])%l==0){
							count -=  (2*t+x[i]-x[0])/l;
						}else{
							count -= (2*t-l+x[i]-x[0])/l;
						}
					}
				}
			}
		}
		if(w[0]==1){
			count %= n;
		}else{
			count = (count%n + n)%n;
		}
		int[] dist = new int[n];
		for(int i=0; i<n; i++){
			if(w[i]==1){
				dist[i] = (x[i] + t)%l;
			}else{
				dist[i] = ((x[i] - t)%l+l)%l;
			}
		}
		int dist0 = dist[0];
		Arrays.sort(dist);
		int index0 = 0;
		if(w[0]==1){
			for(int i=0; i<n; i++){
				if(dist[i]==dist0){
					index0 = i;
					break;
				}
			}
		}else{
			for(int i=n-1; i>=0; i--){
				if(dist[i]==dist0){
					index0 = i;
					break;
				}
			}
		}
		int[] ans = new int[n];
		if(index0>=count){
			for(int i=0; i<n-index0+count; i++){
				ans[i] = dist[i+index0-count];
			}
			for(int i=0; i<index0-count; i++){
				ans[n-index0+count+i] = dist[i];
			}
		}else{
			for(int i=0; i<n-count+index0; i++){
				dist[i] = ans[i+count-index0];
			}
			for(int i=0; i<count-index0; i++){
				dist[n-count+index0+i] = ans[i];
			}
		}
		for(int i=0; i<n; i++){
			System.out.println(ans[i]);
		}
	}
}