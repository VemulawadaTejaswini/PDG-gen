import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputNum = br.readLine().split(" ");

		if(toInt(inputNum[0]) <  toInt(inputNum[1])  && toInt(inputNum[1]) < toInt(inputNum[2])){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

	public static int toInt(String stringNum){
		return Integer.parseInt(stringNum);
	}

}