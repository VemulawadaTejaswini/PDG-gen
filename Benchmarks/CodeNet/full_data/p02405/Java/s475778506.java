import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		int i = 1;
		int j = 0;

		while(true){
			String[] input = br.readLine().split(" ");

			int H = Integer.parseInt(input[0]);
			int W = Integer.parseInt(input[1]);

			if( H==0 && W==0 ) break;

			for( i=1 ; i<=H ; i++ ){
				for( j=1 ; j<=W ; j++ ){
					if( i%2==1 ){
						if( j%2==1 ){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}else{
						if ( j%2==1 ){
							System.out.print(".");
						}else{
							System.out.print("#");
						}
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}