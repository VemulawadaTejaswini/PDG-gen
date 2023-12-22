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
		List<int[]> data = new ArrayList<int[]>();
		for(int i=0; i<size; i++){
			line = in.readLine();
			String[] tmp = line.split(" ");
			int a = Integer.parseInt(tmp[0]);
			int b = Integer.parseInt(tmp[1]);
			data.add(new int[]{a, b});
		}
		
		long cost = 0;
		while(data.size() != 1){
			int min = Integer.MAX_VALUE;
			int a = 0;
			int b = 0;
			for(int i=0; i<data.size(); i++){
				for(int j=i+1; j<data.size(); j++){
					int v = data.get(i)[0] * data.get(j)[1];
					if(v < min){
						min = v;
						a = i;
						b = j;
					}
				}
			}
			
			int[] ab = data.get(a);
			int[] bo = data.get(b);
			int[] co = new int[]{ab[0], bo[1]};
			data.set(b, co);
			data.remove(a);
			cost += (long)ab[0] * (long)ab[1] * (long)bo[0] * (long)bo[1];	
		}
		
		System.out.println(cost);
	}
}