import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int nn = sc.nextInt();
		long kk = sc.nextLong();
		long sum = 0;
		int count = 0;
		long res = 0;
		
		long[]aa=new long[nn];
		Arrays.setAll(aa,i->sc.nextInt());
		Arrays.sort(aa);
				
		int[]ff=new int[nn];
		Arrays.setAll(ff,i->sc.nextInt());
		Arrays.sort(ff);
		
		
		int s;
		for (s=nn-1;s>=0;s--){
			sum += aa[s];
			if (sum == kk) {
				break;
			}else if ( sum > kk){
				aa[s] = aa[s] - ( kk - (sum - aa[s]));
				s++;
				break;
			}
		}
		
		for (int i=0;i<s;i++){
			res = aa[i]*ff[s-i-0];
		}
		
		System.out.print(res);
	}
}