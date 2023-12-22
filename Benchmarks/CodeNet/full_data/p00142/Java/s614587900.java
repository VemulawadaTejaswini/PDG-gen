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
		String line;

		while((line = in.readLine()) != null){
			int n = Integer.parseInt(line);
			if(n==0) break;
			int size = n/2;
			List<Integer> data = new ArrayList<Integer>();
			for(int i=1; i<=size; i++){
				int m = (i * i) % n;
				if(!data.contains(m)){
					data.add(m);
				}
			}

			int s = data.size();
			int[] result = new int[size];

			for(int i=0; i<s; i++){
				for(int j=0; j<s; j++){
					if(i!=j){
						int m = data.get(i) - data.get(j);
						if(m < 0) m += n;
						if(m > size) m = n - m;
						result[m-1]++;
					}
				}
			}

			for(int i=0; i<size; i++){
				System.out.println(result[i]);

			}
		}


	}
}