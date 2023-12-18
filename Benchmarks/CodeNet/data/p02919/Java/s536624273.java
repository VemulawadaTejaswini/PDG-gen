import java.util.Scanner;
import java.util.TreeMap;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] p=new int[n];
		int[] q=new int[n+1];
		TreeMap<Integer,Integer> map=new TreeMap<>();
		long ans=0;
		for(int i=0; i<n; i++){
			p[i]=sc.nextInt();
			q[p[i]]=i;
		}
		map.put(n,n+1);
		map.put(-1,n+1);
		map.put(q[n],n);
		for(int i=n-1; i>0; i--){
			map.put(q[i],i);
			long h1=map.higherKey(q[i]);
			long h2=h1;
			if(h1!=n){
				h2=map.higherKey((int)h1);
			}
			long l1=map.lowerKey(q[i]);
			long l2=l1;
			if(l1!=-1){
				l2=map.lowerKey((int)l1);
			}
			ans+=i*((h2-h1)*(q[i]-l1)+(h1-q[i])*(l1-l2));
		}
		System.out.println(ans);
	}
}
