import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String strARY[] = str.split(" ");
		int w = Integer.parseInt(strARY[0]);
		int h = Integer.parseInt(strARY[1]);
		int x = Integer.parseInt(strARY[2]);
		int y = Integer.parseInt(strARY[3]);
		int r = Integer.parseInt(strARY[4]);
		if (x+r < w && y+r < h && 0 <= x && 0 <= y ){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}