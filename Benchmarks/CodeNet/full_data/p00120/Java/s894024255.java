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

			if(size == 0) break;
			int[] seq = new int[dst.length-1];
			int[] radius = new int[dst.length-1];
			for(int i=1; i<dst.length; i++){
				radius[i-1] = Integer.parseInt(dst[i]);
			}

			for(int i=0; i<dst.length-1; i++){
				seq[i] = i;
			}

			int ok = 0;
			do{
				double cakes = calcSize(radius, seq);
				if(size >= cakes){
					Ans.add("OK");
					ok = 1;
					break;
				}
			}while(nextArray(seq));

			if(ok == 0){
				Ans.add("NA");
			}
		}

		for(int n=0; n<Ans.size(); n++){
			System.out.println(Ans.get(n));
		}
	}

	public boolean nextArray(int[] seq){
		int s = seq.length-1;
		while(true){
			if(seq[s] > seq[s-1]){
				int min = seq[s];
				int index = s;
				for(int n=s+1; n<seq.length; n++){
					if(min > seq[n] && seq[n] > seq[s-1]){
						min = seq[n];
						index = n;
					}
				}

				seq[index] = seq[s-1];
				seq[s-1] = min;
				Arrays.sort(seq, s, seq.length-1);
				return true;

			}else{
				s--;
			}

			if(s == 0){
				return false;
			}
		}
	}

	public double calcSize(int[] data, int[] seq){
		double sum = 0.0;
		sum += data[seq[0]] + data[seq[seq.length-1]];
		for(int i=0; i<data.length-1; i++){
			sum += 2.0 * Math.sqrt(data[seq[i]] * data[seq[i+1]]);
		}

		return sum;
	}
}