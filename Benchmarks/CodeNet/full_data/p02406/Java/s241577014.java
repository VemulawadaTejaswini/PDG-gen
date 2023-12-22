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
			for(int i=3; i<=n; i++){
				int	x = i;
				if(x%3==0){
					System.out.print( " " + i );
					continue;
				}
				while(x!=0){
					if(x%10==3){
						System.out.print( " " + i );
						break;
					}
					x /= 10;
				}
			}
			System.out.println();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

}