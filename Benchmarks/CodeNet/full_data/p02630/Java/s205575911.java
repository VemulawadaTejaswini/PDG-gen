import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws IOException{
               BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		int n= Integer.parseInt(reader.readLine());
		int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int q = Integer.parseInt(reader.readLine());
		HashMap<Integer,Integer> hm = new HashMap<>();
		long sum = 0;
		for(int o:list){
			hm.put(o,hm.getOrDefault(o,0)+1);
			sum+=o;
		}
		for(int i=0;i<q;i++){
			String[] pol = reader.readLine().split(" ");
			int a = Integer.parseInt(pol[0]);
			int b = Integer.parseInt(pol[1]);
			if(hm.containsKey(a)){
				int p = hm.get(a);
				hm.put(b,hm.getOrDefault(b,0)+p);
				hm.remove(a);
				sum-=p*a;
				sum+=p*b;
			}
			System.out.println(sum);
		}		
	}
}
