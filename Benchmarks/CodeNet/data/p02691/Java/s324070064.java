import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		Map<Long,Long> a=new HashMap<>();
        Map<Long,Long> b=new HashMap<>();
		for(int i=0;i<n;i++){
            long t=sc.nextLong();
            Long x=a.get(i-t);
			if(x==null){
				a.put(i-t,(long)1);
			}else{
				a.put(i-t,x+1);
			}
            x=b.get(t+i);
			if(x==null){
				b.put(t+i,(long)1);
			}else{
				b.put(t+i,x+1);
			}
		}
		long ans=0;
		for (Long key : a.keySet()) {
			Long x=a.get(key);
			if(x==null){
				x=(long)0;
			}
            Long y=b.get(key);
			if(y==null){
				y=(long)0;
			}
            ans+=x*y;
		}
		System.out.println(ans);
	}
}
