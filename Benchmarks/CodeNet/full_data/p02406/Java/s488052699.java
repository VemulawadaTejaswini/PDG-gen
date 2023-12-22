import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int number = Integer.parseInt(br.readLine());

		for(int i = 1; i <= number; i++){
				if(i % 3 == 0 || i % 10 == 3){
					System.out.print(" " + i);
				}
			}
	}

}