import java.io.BufferedReader;
import java.io.InputStreamReader;

public class bublesort {
	public static void main(String[] args) throws Exception{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int temp;
		int[] nums = new int[N];
		for(int i=0; i<N;i++){
			nums[i] = Integer.parseInt(bf.readLine());
		}
		int rta =0;
		boolean cambio = true;
		while(cambio){
			cambio = false;
			for(int i=0; i<N-2;i++){
				if(nums[i]>nums[i+2]){
					cambio=true;
					temp=nums[i];
					nums[i]=nums[i+2];
					nums[i+2]=temp;
				}
			}
		}
		for(int i=0; i<N-1;i++){
			if(nums[i]>nums[i+1]){
				rta++;
				temp = nums[i];
				nums[i]=nums[i+1];
				nums[i+1]=temp;
			}
		}
		System.out.println(rta);
	}
}
