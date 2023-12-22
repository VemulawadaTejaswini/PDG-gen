import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = br.readLine();
			int n = Integer.parseInt(buf);
			int i = 1;
			do{
				int x = i;

				if( x % 3 == 0 ){
					System.out.print(" "+i);

				}else	if( x % 10 ==3 ){
					System.out.print(" "+i);
				}

				x/=10;

				if( ++i >= n ){
					System.out.print(" "+i);
					break;
				}
			}while(true);

		} catch (IOException e) {
			System.err.println(e);
		}
	}

}