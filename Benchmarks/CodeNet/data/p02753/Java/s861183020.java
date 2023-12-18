import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] S ;
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String W = in.readLine();

		if(W.replaceAll("A", "").length() == 3||W.replaceAll("A", "").length()==0){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}


}
