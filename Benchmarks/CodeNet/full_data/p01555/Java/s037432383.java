import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long s = sc.nextLong();
		
		long[] a = new long[20];
		long[] b = new long[20];
		for(int i=1;;i++){
			long all = (long)Math.pow(10, i);
			b[i] = all/3 + all/5;
			long sum = 0;
			long sum2 = 0;
			for(int j=i;j>0;j--){
				sum += (b[j]-b[j-1])*j;
				sum2 += (b[j]-b[j-1]);
			}
			a[i] = b[i]*4 + sum;

			if(a[i]>s){
				sum2 -= (b[i]-b[i-1]);
				sum -= (b[i]-b[i-1])*i;
				long left = (long)Math.pow(10, i-1);
				long right = (long)Math.pow(10, i)-1;
				long mid = -1;
				long id = -1;
				while(true){
					mid = (left+right)/2;
					
					long fb = mid/3 + mid/5;
					long dif = mid-sum2-fb+mid/15;
					id = fb*4 + sum + dif*i;
					
					if(id<s){
						left = mid+1;
					}else{
						right = mid-1;
					}

					if(left>right) break;
				}
				String str = "";
				for(long j=mid;j<=mid+20;j++){
					if(j%3==0) str += "Fizz";
					if(j%5==0) str += "Buzz";
					if(j%3!=0 && j%5!=0) str += j;
				}
				
				long mus = i;
				if(mid%15==0) mus = 8;
				else if(mid%3==0 || mid%5==0) mus = 4;
				long iid = mus-(id-s+1);
				str = str.substring((int)iid, (int)(iid+20));
				System.out.println(str);
				break;
			}
		}
	}	
}