import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[] x=new int[100001];
		int[] mod=new int[m];
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0; i<n; i++){
			int tmp=sc.nextInt();
			int mt=tmp%m;
			x[tmp]++;
			mod[mt]=Math.max(x[tmp],mod[mt]);
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
			if(!map.containsKey(i) || !map.containsKey(m-i)){
				continue;
			}
			long ii=map.get(i);
			long mi=map.get(m-i);
			ans+=Math.min(ii,mi);
			if(ii>mi){
				ans+=Math.min((ii-mi)/2,mod[i]);
			}else{
				ans+=Math.min((mi-ii)/2,mod[m-i]);
			}
		}
		if(m%2==0 && map.containsKey(m/2)){
			ans+=map.get(m/2)/2;
		}
		System.out.println(ans);
	}
}
