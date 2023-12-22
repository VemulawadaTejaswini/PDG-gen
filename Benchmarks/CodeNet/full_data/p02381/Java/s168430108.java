import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			int num = Integer.parseInt(br.readLine());
			if(num == 0){
				break;
			}
			int[] su = new int[num];
			String[] str = br.readLine().split(" ");

			for(int i = 0; i < str.length; i++){
				su[i] = Integer.parseInt(str[i]);
			}

			double sum = 0;

			for(int i = 0; i < su.length; i++){
				sum += su[i];
			}

			double avg = sum / num;
			double result = 0;

			for(int i = 0; i < num; i++){
				result += (Math.pow((su[i] - avg), 2)/num);
			}
			System.out.println(Math.sqrt(result));
		}
	}
}