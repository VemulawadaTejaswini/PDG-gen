import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		int[] Arr = new int[N];
		String lin = br.readLine();
		String[] A=lin.split(" ");
		int odd=0;
		for(int n=0;n<N;n++){
			Arr[n] = Integer.parseInt(A[n]);
			if(Arr[n]%2==1){
				odd++;
			}
		}
		//System.out.println(odd);
		if(odd==0){
			long sum=0;
			for(int i=0;i<N;i++){
				sum+=Arr[i];
			}
			if((sum/N)==Arr[0]){
				System.out.println(1);
				int counter1=0;
				while(Arr[0]%2==0){
					counter1++;
					sum=sum/2;
				}
				System.out.println(counter1);
			}
			else{
				int counter=0;
				while(sum%2==0){
					//System.out.println(1);
					counter++;
					sum=sum/2;
				}
				System.out.println(counter);
			}
			
		}
		else{
			System.out.println(0);
		}
		
	}
}
