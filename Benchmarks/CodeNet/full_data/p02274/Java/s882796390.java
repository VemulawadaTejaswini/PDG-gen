import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Main {
   public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		String[] str = br.readLine().split(" ");
		long cnt;
		
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
		}
		
		cnt = invCount(A);
		
		System.out.println(cnt);
	}
	
	public static long invCount(int[] data){
		if(data.length < 2){
			return 0;
		}
		
		int middle = (data.length + 1) / 2;
		int[] left = Arrays.copyOfRange(data, 0, middle);
		int[] right = Arrays.copyOfRange(data, middle, data.length);
		
		return invCount(left) + invCount(right) + merge(data, left, right);
	}
	
	public static long merge(int[] array, int[] left, int[] right){
		int i = 0, j = 0, count = 0;
		
		while(i < left.length || j < right.length){
			if(i == left.length){
				array[i + j] = right[j];
				j++;
			}else if(j == right.length){
				array[i + j] = left[i];
				i++;
			}else if(left[i] <= right[j]){
				array[i + j] = left[i];
				i++;
			}else{
				array[i + j] = right[j];
				count += left.length - i;
				j++;
			}
		}
		
		return count;
	}
}