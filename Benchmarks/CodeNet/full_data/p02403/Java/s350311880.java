import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String [] str = bufferedReader.readLine().split(" ");
			Integer h = Integer.parseInt(str[0]);
			Integer k = Integer.parseInt(str[1]);
			if (h == 0 && k == 0)  {
				System.exit(1);
			}
			
			for(int i  = 0; i < h; i++){
				for(int j = 0; j < k; j++){
					System.out.print("#");
				}
				System.out.println("");
			}
			System.out.println("");
		}
	}
}