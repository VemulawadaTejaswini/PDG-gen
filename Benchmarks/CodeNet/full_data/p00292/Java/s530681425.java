import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);

		Integer num = Integer.parseInt(br.readLine());

		for(int i = 0; i < num; i++){

			String str;
			if((str=br.readLine())!=null){
				String[] sp = str.split(" ");
				int a =Integer.parseInt(sp[0]);
				int b =Integer.parseInt(sp[1]);

				if(a % b == 0){
					System.out.println(b);
				} else{
					System.out.println(a % b);
				}
			}
		}
	}

}