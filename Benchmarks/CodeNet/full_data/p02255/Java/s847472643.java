import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] data = new int[num];
		String[] input = br.readLine().split(" ");

		for(int i = 0; i < num; i++){
			data[i] = Integer.parseInt(input[i]);
		}


		Main m = new Main();
		m.output(data, num);
		m.insertionSort(data, num);

	}

	public void insertionSort(int[] data, int num){

		for(int i = 1; i < num; i++){

			int temp = data[i];
			int j = i - 1;

			while(j >= 0 && data[j] > temp){
				data[j + 1] = data[j];
				j--;
			}

			data[j + 1] = temp;

			output(data, num);

		}

	}

	public void output(int[] data, int num){

		for(int i = 0; i < num; i++){

			System.out.print(data[i]);

			if(i != num - 1){
				System.out.print(" ");
			}else{
				System.out.print("\n");
			}

		}

	}

}