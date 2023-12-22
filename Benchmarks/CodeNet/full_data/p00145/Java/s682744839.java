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
		List<Cards> data = new ArrayList<Cards>();
		for(int i=0; i<size; i++){
			line = in.readLine();
			String[] tmp = line.split(" ");
			long a = Long.parseLong(tmp[0]);
			long b = Long.parseLong(tmp[1]);
			data.add(new Cards(a, b));
		}
		
		long cost = 0;
		while(data.size() != 1){
			long min = Long.MAX_VALUE;
			int index = 0;
			for(int i=0; i<data.size()-1; i++){
				long v = data.get(i).above * data.get(i+1).bottom;
				if(v < min){
					min = v;
					index = i;
				}
			}
			
			Cards ab = data.get(index);
			Cards bo = data.get(index+1);
			Cards co = Cards.join(ab, bo);
			data.set(index+1, co);
			data.remove(index);
			cost += Cards.join_cost(ab, bo);
		}
		
		System.out.println(cost);
	}
}

class Cards{
	long above;
	long bottom;
	public Cards(long a, long b){
		this.above = a;
		this.bottom = b;
	}
	
	static Cards join(Cards c1, Cards c2){
		return new Cards(c1.above, c2.bottom);
	}
	
	static long join_cost(Cards c1, Cards c2){
		return c1.above * c1.bottom * c2.above * c2.bottom;
	}
}