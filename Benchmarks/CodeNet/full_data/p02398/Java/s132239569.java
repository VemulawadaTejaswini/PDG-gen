import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		String strArray[] = str.split(" ", 0);
		int a = Integer.parseInt(strArray[0]);
		int b = Integer.parseInt(strArray[1]);
		int c = Integer.parseInt(strArray[2]);
		int tmp = 0;

		while(a <= b){

			if(c%a ==0){
				tmp++;
			}
			a++;
		}
		System.out.println(tmp);
	}

}