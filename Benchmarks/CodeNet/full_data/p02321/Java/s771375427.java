import java.util.HashMap;
import java.util.Scanner;

public class Main{
	static final Scanner s=new Scanner(System.in);

	public static void main(String __[]){
		int n=s.nextInt();
		long m=s.nextLong();
		// <Weight,Value>
		HashMap<Long,Long> hm=new HashMap<>(),buf=new HashMap<>();
		hm.put(0L,0L);
		for(int i=0;i<n;i++){
			buf.clear();
			long v=s.nextLong(),w=s.nextLong();
			hm.forEach((a,b)->{
				if(a+w<=m)
					buf.merge(a+w,b+v,Math::max);
			});
			hm.putAll(buf);
		}
		System.out.println(hm.values().stream().mapToLong(i->i).max().getAsLong());
	}
}