import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Main {
   public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] A = new int[n];
		
		int cnt;
		
		String[] str = br.readLine().split(" ");
		
		for(int i = 0; i < n; i++){
			A[i] = Integer.parseInt(str[i]);
		}
		
		cnt = bubbleSort(A);
		
		System.out.println(cnt);
	}
	
	static int bubbleSort(int data[]){
		int temp;
		int c = 0;
		
		for(int i = 0; i < data.length - 1; i++){
			boolean notexchange = true;
			for(int j = data.length - 1; j > i; j--){
				if(data[j - 1] > data[j]){
					temp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = temp;
					c++;
					notexchange = false;
				}
			}
			if(notexchange){
				break;
			}
		}
		
		return c;
	}
}