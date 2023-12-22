import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String[] tmpArray = br.readLine().split(" ");

			if(tmpArray[0].equals("#")){
				break;
			}

			String eraName = tmpArray[0];

			int y = Integer.parseInt(tmpArray[1]);
			int m = Integer.parseInt(tmpArray[2]);
			int d = Integer.parseInt(tmpArray[3]);

			boolean newEra = false;
			if(y >= 32){
				newEra = true;
			}

			if(y == 31){
				if(m >= 5){
					newEra = true;
				}
			}

			if(newEra){
				System.out.println("? "+(y-30)+" "+m+" "+d);
			}
			else {
				System.out.println(eraName+" "+y+" "+m+" "+d);
			}
		}
	}

}

