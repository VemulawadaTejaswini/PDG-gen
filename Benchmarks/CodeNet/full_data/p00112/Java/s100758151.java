import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class Main{
	public static void main(String args[]){
		new Main();
	}

	public Main(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<int[]> nums = new ArrayList<int[]>();
		List<Integer> ans = new ArrayList<Integer>();

		try{
			String line;
			while((line = br.readLine()) != null){
				int data_size = Integer.parseInt(line);

				if(data_size == 0) break;

				int[] num_set = new int[data_size];

				for(int i=0; i<data_size; i++){
					num_set[i] = Integer.parseInt(br.readLine());
				}
				nums.add(num_set);
			}

		}catch(IOException err){
			err.printStackTrace();
		}

		for(int i=0; i<nums.size(); i++){
			int[] dst = nums.get(i);

			for(int ii=0; ii<dst.length-1; ii++){
				for(int jj=dst.length-1; jj>i; jj--){
					if(dst[jj] < dst[jj-1]){
						int t = dst[jj];
						dst[jj] = dst[jj-1];
						dst[jj-1] = t;
					}
				}
			}

			int sum = 0;
			for(int j=0; j<dst.length; j++){
				sum += dst[j] * (dst.length-j-1);
			}

			ans.add(sum);
		}

		for(int i=0; i<ans.size(); i++){
			System.out.println(ans.get(i));
		}
	}
}