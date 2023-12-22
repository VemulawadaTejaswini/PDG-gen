import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);
		String string;
		int n, sum;
		boolean judge;
		
		while(!(string = reader.readLine()).equals("0")){
			n = Integer.parseInt(string);
			
			ArrayList<Integer> divisor = new ArrayList<Integer>();
			for(int i = 1; i < n; i++){
				if(n % i == 0){
					divisor.add(i);
				}
			}
			sum = 0;
			judge = false;
			for(int i = 0; i < divisor.size(); i++){
				sum += divisor.get(i);
				if(sum > n){
					judge = true;
					break;
				}
			}
			if(judge){
				System.out.println("abundant number");
			}else if(sum == n){
				System.out.println("perfect number");
			}else{
				System.out.println("deficient number");
			}
		}
		reader.close();
	}
}