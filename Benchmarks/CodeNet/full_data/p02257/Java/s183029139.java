import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i = 0;i < n; i++){
			int num = Integer.parseInt(br.readLine());
			solve(num);
		}

		System.out.println(count);

	}

	public static void solve(int num){
		if(num == 1){
			return;
		}
		else if(num == 2){
			count++;
			return;
		}
		else if(num % 2 == 0){
			return;
		}
		else{
			for(int i = 3;i <= Math.sqrt(num); i++){
				if(num % i == 0){
					return;
				}
			}
		}
		count++;
	}

}