import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmpArray = br.readLine().split(" ");
		
		int x = Integer.parseInt(tmpArray[0]);
		int y = Integer.parseInt(tmpArray[1]);
		
		
		while (x != y){
			//System.out.println(x + " " + y);
			if(y > x){
				int tmp = y;
				y = x;
				x = tmp;
			}
			if(x%y == 0){
				x = y;
				break;
			}
			x = x%y;
		}		
		
		System.out.println(x);
	}

}