import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] x=new int[100001];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0; i<n; i++){
			int tmp=sc.nextInt();
			int mt=tmp%m;
			x[tmp]++;
			if(map.containsKey(mt)){
				map.put(mt,map.get(mt)+1);
			}else{
				map.put(mt,1);
			}
		}
		long ans=0;
		if(map.containsKey(0)){
			ans=map.get(0)/2;
		}
		for(int i=1; i<=(m-1)/2; i++){
			long sum=0;
			if(map.containsKey(i) && map.containsKey(m-i)){
			long ii=map.get(i);
			long mi=map.get(m-i);
			if(ii>mi){
				ans+=mi;
				for(int j=i; j<100001; j+=m){
					sum+=x[j]/2;
				}
				ans+=Math.min((ii-mi)/2,sum);
			}else{
				ans+=ii;
				for(int j=m-i; j<100001; j+=m){
					sum+=x[j]/2;
				}
				ans+=Math.min((mi-ii)/2,sum);
			}
			}else{
				if(map.containsKey(i)){
					for(int j=i; j<100001; j+=m){
					sum+=x[j]/2;
				}
					ans+=sum;
				}else if(map.containsKey(m-i)){
					for(int j=m-i; j<100001; j+=m){
					sum+=x[j]/2;
				}
					ans+=sum;
				}
			}
			
		}
		if(m%2==0 && map.containsKey(m/2)){
			ans+=map.get(m/2)/2;
		}
		System.out.println(ans);
	}
}
