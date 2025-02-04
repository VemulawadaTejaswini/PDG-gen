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
		String line;

		while((line = in.readLine()) != null){
			String[] dst = line.split(" ");
			double box = Double.parseDouble(dst[0]);

			if(box == 0) break;

			int size = dst.length-1;
			int[] rad = new int[size];
			int[] sort = new int[size];
			for(int n=0; n<size; n++){
				rad[n] = Integer.parseInt(dst[n+1]);
			}

			int m = size/2;
			Arrays.sort(rad);
			for(int i=0; i<m; i++){
				sort[2*i] = rad[i];
				sort[2*i+1] = rad[size-1-i];
			}
			if(size%2==1){
				sort[size-1] = rad[m];
			}

			double cost = min_cost(sort);
			System.out.println(cost);
			if(cost <= box){
				System.out.println("OK");
			}else{
				System.out.println("NA");
			}

		}
	}

	public double min_cost(int[] data){
		Random rand = new Random(System.currentTimeMillis());
		double e = E(data);
		double ebest = e;
		double enew = e;
		int[] s = copy(data);
		int[] snew = copy(data);
		int[] sbest = copy(data);
		for(int n=0; n<10000; n++){
			snew = swap(s);
			enew = E(snew);
			if(enew < ebest){
				ebest = enew;
				sbest = copy(snew);
			}
			else{
				if(Math.exp((ebest - enew) * 10.0) < rand.nextFloat()){
					s = copy(snew);
					e = enew;
				}
			}
		}

		return ebest;
	}

	public int[] swap(int[] src){
		int[] data = copy(src);
		int n = data.length;
		Random rand = new Random(System.currentTimeMillis());
		int from = rand.nextInt(n);
		int to = rand.nextInt(n);
		int dst = data[from];
		data[from] = data[to];
		data[to] = dst;
		return data;
	}

	public double E(int[] data){
		int n = data.length;
		double e = (double)(data[0] + data[n-1]);
		for(int i=0; i<n-1; i++){
			e += 2.0 * Math.sqrt(data[i] * data[i+1]);
		}
		return e;
	}

	public int[] copy(int[] data){
		int n= data.length;
		int[] dst = new int[n];
		for(int i=0; i<n; i++){
			dst[i] = data[i];
		}
		return dst;
	}
}