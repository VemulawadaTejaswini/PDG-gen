import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String line = in.readLine();
		int size = Integer.parseInt(line);
		List<long[]> data = new ArrayList<long[]>();
		for(int i=0; i<size; i++){
			line = in.readLine();
			String[] tmp = line.split(" ");
			long a = Long.parseLong(tmp[0]);
			long b = Long.parseLong(tmp[1]);
			data.add(new long[]{a, b});
		}
		
		long cost = 0;
		while(data.size() != 1){
			long min = Long.MAX_VALUE;
			int a = 0;
			int b = 0;
			for(int i=0; i<data.size()-1; i++){
				long v = (long)data.get(i)[0] * (long)data.get(i+1)[1];
				if(v < min){
					min = v;
					a = i;
					b = i+1;
				}
			}
			
			long[] ab = data.get(a);
			long[] bo = data.get(b);
			long[] co = new long[]{ab[0], bo[1]};
			data.set(b, co);
			data.remove(a);
			cost += (long)ab[0] * (long)ab[1] * (long)bo[0] * (long)bo[1];	
		}
		
		System.out.println(cost);
	}
}