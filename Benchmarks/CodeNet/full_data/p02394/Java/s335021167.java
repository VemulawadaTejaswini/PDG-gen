import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String strArray[] = str.split(" ", 0);
		int num[] = new int[strArray.length];

		for(int i=0; i<strArray.length; i++){
			num[i] = Integer.parseInt(strArray[i]);
		}

		int W = num[0];
		int H = num[1];
		int x = num[2];
		int y = num[3];
		int r = num[4];
		
		if(x+r <= W && x-r >= 0 && y+r <= H && y-r >= 0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}