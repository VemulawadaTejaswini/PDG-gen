import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int week = Integer.parseInt(br.readLine());
		
		int debt = 100000;
		for(int i = 0; i < week; i++){
			debt *= 1.05;
			if(debt % 1000 > 0){
				debt = (debt/1000)*1000+1000;
			}
		}
		System.out.println(debt);
	}

}