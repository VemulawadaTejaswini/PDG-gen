import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	static int N;
	static int [] A;
	static int max;
	static int count;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		String [] temp = br.readLine().split(" ");
		max = temp.length;
		A = new int[max];
		for(int i=0;i < max;i++){
			A[i] = Integer.parseInt(temp[i]);
		}

		for(int i=0;i < max;i++){
			sort();
		}

		for(int i=0;i < max-1;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println(A[max-1]);
		System.out.println(count);
	}

	public static void sort(){
		for(int i=max-1;i>0;i--){
			if(A[i] >= A[i-1]){
				continue;
			}
			else{
				int num = A[i];
				A[i] = A[i-1];
				A[i-1] = num;
				count++;
			}


		}
	}

}