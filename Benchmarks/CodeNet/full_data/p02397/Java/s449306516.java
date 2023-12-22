
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		int box;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
		String[] inputNum = br.readLine().split(" ");
		int x = Integer.parseInt(inputNum[0]);
		int y = Integer.parseInt(inputNum[1]);

		if (x == 0 && y == 0) {
			break;
		}

		if(x > y){
			box = x;
			x = y;
			y = box;
		}

		System.out.println(x + " " + y);

		}


	}

}