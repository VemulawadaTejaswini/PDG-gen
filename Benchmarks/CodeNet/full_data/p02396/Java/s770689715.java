import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
	public static void main(String[] args)throws IOException {

		int num = 1;
		int cnt = 1;
		for(int j = 0;j < 10000 && num != 0; j++) {
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));

			String str= br.readLine();
			num = Integer.parseInt(str);
			if(num > 0) {
				System.out.println("Case " + cnt +": " + num);
				cnt++;
				
			}
			
		}

	}

}