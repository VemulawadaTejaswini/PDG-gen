import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		int n= Integer.parseInt(reader.readLine());
		long[] list = Arrays.stream(reader.readLine().split(" ")).mapToLong(Long::parseLong).toArray();
		int q = Integer.parseInt(reader.readLine());
		HashMap<Long,Long> hm = new HashMap<>();
		long sum = 0;
		for(long o:list){
			hm.put(o,hm.getOrDefault(o,(long)0)+1);
			sum+=o;
		}
		for(int i=0;i<q;i++){
			String[] pol = reader.readLine().split(" ");
			long a = Long.parseLong(pol[0]);
			long b = Long.parseLong(pol[1]);
			if(hm.containsKey(a)){
				long p = hm.get(a);
				hm.put(b,hm.getOrDefault(b,(long)0)+p);
				hm.remove(a);
				sum-=p*a;
				sum+=p*b;
			}
			System.out.println(sum);
		}		
	}
}
