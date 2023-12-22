import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int week = Integer.parseInt(input);
		int loan = 100000;
		for(int i = 1;i <= week;i++){
			loan *= 1.05;
			if(loan % 1000 != 0){
				loan += 1000 - loan % 1000;
			}
		}
		System.out.println(loan);
	}
}