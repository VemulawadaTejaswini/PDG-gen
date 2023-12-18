import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		Double[] a=new Double[n];
		long zero=0;
		long plus=0;
		long ma=0;
		ArrayList<Double> p=new ArrayList<>();
		ArrayList<Double> mai=new ArrayList<>();
		for(int i=0; i<n; i++){
			a[i]=sc.nextDouble();
			if(a[i]>0){
				plus++;
				p.add(a[i]);
			}else if(a[i]<0){
				ma++;
				mai.add(a[i]);
			}else{
				zero++;
			}
		}
		long l=-1000000000000000000L;
		long r=1000000000000000001L;
		if(ma*plus>=k){
			r=0;
		}else if(ma*plus+zero*((n-1)*n/2-(zero-1)*zero/2)>=k){
			System.out.println(0);
			return;
		}else{
			l=1;
		}
		Collections.sort(p,reverseOrder());
		Collections.sort(mai);
		while(r-l>1){
			long m=(r+l)/2;
			long count=0;
			for(int i=0; i<n; i++){
				int in=0;
				if(m>0){
					if(a[i]<0){
						in=-Collections.binarySearch(mai,m/a[i]+0.1)-1;
					}else{
						in=-Collections.binarySearch(p,m/a[i]+0.1)-1;
					}
				}else{
					if(a[i]<0){
						in=-Collections.binarySearch(p,m/a[i]-0.1)-1;
					}else{
						in=-Collections.binarySearch(mai,m/a[i]+0.1)-1;
					}
				}
				count+=in;
			}
			System.out.println(count+" "+m);
			if(count/2<k){
				l=m;
			}else{
				r=m;
			}
		}
		System.out.println(l+1);
	}
}
