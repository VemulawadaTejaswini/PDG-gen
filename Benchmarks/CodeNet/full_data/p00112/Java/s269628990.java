import java.io.*;
import java.util.List;
import java.util.ArrayList;


public class Main{
	public static void main(String args[]){
		new Main();
	}

	public Main(){
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> nums = new ArrayList<Integer>();

		try{
			String line;
			while((line = br.readLine()) != null){
				int num = Integer.parseInt(line);

				if(num == 0){
					break;
				}

				nums.add(num);
			}

		}catch(IOException err){
			err.printStackTrace();
		}

		int n = nums.get(0);
		nums.remove(0);

		int[] dst = new int[nums.size()];
		for(int i=0; i<nums.size(); i++){
			dst[i] = nums.get(i);
		}

		sort(dst);

		int sum = 0;
		for(int i=0; i<n; i++){
			sum += dst[i] * (n-i-1);
		}

		System.out.println(sum);

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