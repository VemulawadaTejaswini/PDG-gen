import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int su = 0;
		for(int i = 0;;i++){
			su = Integer.parseInt(br.readLine());
			if(su == 0){
				break;
			}
			System.out.println("Case "+ (i + 1) +": "+su);
		}
	}
}