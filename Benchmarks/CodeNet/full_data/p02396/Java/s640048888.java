import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		
		for (int i = 1; i <= 10000; ++i){
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
			String sNum = br.readLine();
			int iNum = Integer.parseInt(sNum);
			
			if (iNum == 0){
				return;
			}
			
			System.out.println("Case "+ i + ": " + iNum);
		}
		return ;
	}

}