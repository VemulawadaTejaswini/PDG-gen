import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i,no=1;
		while(true){
			i=Integer.parseInt(br.readLine());

			if(i!=0){
			System.out.println("Case "+ no +" " + i);
			}else{
				return;
			}
			no++;


		}
	}
}