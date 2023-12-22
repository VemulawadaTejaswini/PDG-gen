//API???????????????
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
  	
	private static int[] A = new int[2000001];
	private static int size = 0;
	
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(;;){
			String[] instruction = br.readLine().split(" ");
			String str = instruction[0];
			
			if(str.equals("end")){
				break;
			}
			
			
			if(str.equals("insert")){
				size++;
				int num = Integer.parseInt(instruction[1]);
				A[size] = num;
				int i = size;
				while(i > 1 && A[i / 2] < A[i]){
					swap(i, i / 2);
					i /= 2;
				}
			}else if(str.equals("extract")){
				int max = A[1];
				A[1] = 0;
				swap(1, size);
				size--;
				maxHeapify(1);
				System.out.println(max);
			}
		}
	}
	
	public static void maxHeapify(int i){
		int l = i * 2;
		int r = i * 2 + 1; 
		
		//????????????????????????????????§???????????§????????????????????¶
		int large;
		if(l <= size && A[l] > A[i]) large = l;
		else large = i;
		if(r <= size && A[r] > A[large]) large = r;
		//i?????????????????§????????´???
		if(large != i){
			swap(i, large);
			maxHeapify(large);
		}
	}
	
	public static void swap(int i, int j){
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}