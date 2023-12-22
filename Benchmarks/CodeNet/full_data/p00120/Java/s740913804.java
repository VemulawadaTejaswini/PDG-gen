import java.io.*;
import java.util.*;

public class Main{
	public static void main(String args[]){
		try{
			new Main();
		}catch(IOException err){
			err.printStackTrace();
		}
	}

	public Main() throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> Ans = new ArrayList<String>();
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			int size = Integer.parseInt(dst[0]);
			//if(size == 0) break;

			int[] radius = new int[dst.length-1];
			for(int i=1; i<dst.length; i++){
				radius[i-1] = Integer.parseInt(dst[i]);
			}

			Arrays.sort(radius);

			radius = bind(radius);

			double cakes = calcSize(radius);
			if(cakes <= size){
				Ans.add("OK");
			}else{
				Ans.add("NA");
			}
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}

	public int[] bind(int[] data){
		int n = data.length;
		int[] dst = new int[n];

		for(int i=0; i<n/2; i++){
			dst[2*i] = data[i];
			dst[2*i+1] = data[n-i-1];
		}

		if(n%2 == 1){
			dst[n-1] = data[n/2];
		}

		return dst;
	}

	public double calcSize(int[] data){
		double sum = 0.0;
		sum += data[0] + data[data.length-1];
		for(int i=0; i<data.length-1; i++){
			sum += 2.0 * Math.sqrt(data[i] * data[i+1]);
		}

		return sum;
	}
}