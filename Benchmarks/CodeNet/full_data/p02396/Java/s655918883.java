import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		String n;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = br.readLine();
		int i = 1;
		while(i != 0){
			System.out.println("Case " + i +": " + n);
			i++;
			break;
		}
	}

}