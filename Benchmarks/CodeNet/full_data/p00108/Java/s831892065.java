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
		List<Integer> nums = new ArrayList<Integer>();
		List<int[]> sequence = new ArrayList<int[]>();
		String line;

		while((line = in.readLine()) != null){
			int size = Integer.parseInt(line);

			if(size == 0){
				break;
			}

			line = in.readLine();
			String[] dst = line.split(" ");
			int[] data = new int[dst.length];
			for(int i=0; i<data.length; i++){
				data[i] = Integer.parseInt(dst[i]);
			}

			int count = 0;
			while(true){
				int[] old = new int[data.length];
				for(int i=0; i<data.length; i++){
					old[i] = data[i];
				}
				Process(data);
				if(isSame(data, old)){
					break;
				}
				count++;
			}

			nums.add(count);
			sequence.add(data);
		}

		for(int i=0; i<nums.size(); i++){
			System.out.println(nums.get(i));
			int[] dst = sequence.get(i);
			for(int j=0; j<dst.length; j++){
				System.out.print(dst[j]);

				if(j == dst.length-1){
					System.out.println();
				}else{
					System.out.print(" ");
				}
			}
		}
	}

	public void Process(int[] data){
		int[] result = new int[data.length];

		for(int i=0; i<data.length; i++){
			int n = data[i];
			int count = 0;

			for(int j=0; j<data.length; j++){
				if(n == data[j]){
					count++;
				}
			}
			result[i] = count;
		}

		for(int i=0; i<data.length; i++){
			data[i] = result[i];
		}
	}

	public boolean isSame(int[] a, int[] b){
		for(int i=0; i<a.length; i++){
			if(a[i] != b[i]){
				return false;
			}
		}

		return true;
	}
}