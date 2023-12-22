import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws Exception{
		BufferedReader br = 
			new BufferedReader(new InputStreamReader(System.in));
		int n = br.read();
		String[] numbers = br.readLine().split(" ");
		int[] data = new int[n];
		int v = 0;
		int j = 0;

		for(int i = 0; i < n; i++){
			data[i] = Integer.parseInt(numbers[i]);
		}

		for(int i = 1; i < n-1; i++){
			v = data[i];
			j = i-1;
			while(j >= 0 && data[j] > v){
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = v;

			for(int k = 0; k < n; k++){
				System.out.print(data[k]);
			}
			System.out.print("\n");
		}

		
	}
}