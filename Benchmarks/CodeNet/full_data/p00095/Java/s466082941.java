
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		int number = Integer.parseInt(num);

		int primeNum = 1;
		int primeQty = 0;

		for(int i=0; i<number; i++){
			String oneline = br.readLine();
			String[] line = oneline.split(" ");	// 0->?????????1->??°???

			int Num = Integer.parseInt(line[0]);
			int Qty = Integer.parseInt(line[1]);

			if(primeQty < Qty){
				primeNum = Num;
				primeQty = Qty;
			}
		}

		System.out.println(primeNum+ " "+ primeQty);
	}

}