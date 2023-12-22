import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no=1;
		String i;
		while(true){
			i=br.readLine();

			if(i!="0"){
			System.out.println("Case "+ no +": " + i);
			}else{
				return;
			}
			no++;


		}
	}
}