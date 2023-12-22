import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int n = Integer.parseInt(in.readLine());
			if(n == 0){
				break;
			}
			ArrayList<Integer> nums = new ArrayList<Integer>();
			int max = 0;
			nums.add(new Integer(0));
			for(int i= 0; i < n;i++){
				int nn = Integer.parseInt(in.readLine());
				if(nums.get(nums.size()-1)*nn >= 0){
					//??????
					int j = nums.get(nums.size()-1) + nn;
					nums.set(nums.size()-1, j);
				}
				else {
					//??????
					nums.add(nn);
				}	
			}
			if(nums.get(0) < 0){
				nums.remove(0);
			}
			max = nums.get(0);
			for (int i = 2;i < nums.size(); i = i+2){
				if(max < nums.get(i)){
					max = nums.get(i);
				}
			}
			boolean f = true;
			while(f){
				for(int i = 2 ; i < nums.size() ;i = i+2){
					int j = nums.get(i) + nums.get(i-1) + nums.get(i-2);
					if(max <= j){
						max = j;
						nums.set(i-2, j);
						nums.remove(i);
						nums.remove(i-1);
						f = true;
						break;
					}
					f = false;
				}	
				if(nums.size() < 3){
					f = false;
				}
			}
			System.out.println(max);
		}	
	}
}