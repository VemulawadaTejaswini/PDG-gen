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
			sort(dst);

			int sum = 0;
			for(int j=0; j<dst.length; j++){
				sum += dst[j] * (dst.length-j-1);
			}

			System.out.println(sum);
		}
	}

	public void sort(int[] a){
		for(int i=0; i<a.length-1; i++){
			for(int j=a.length-1; j>i; j--){
				if(a[j] < a[j-1]){
					int t = a[j];
					a[j] = a[j-1];
					a[j-1] = t;
				}
			}
		}
	}
}