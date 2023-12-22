import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] age)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = 0;
		int j = 0;

		while(true){

			String[] input = br.readLine().split(" ");

			int H = Integer.parseInt(input[0]);
			int W = Integer.parseInt(input[1]);

			if( H==0 && W==0) break;

			for( i=0 ; i<H ; i++ ){
				if( i==0 | i==H-1 ){
					for( j=0 ; j<W ; j++){
						System.out.print("#");
					}
				}else{
					for( j=0 ; j<W ; j++ ){
						if( j==0|| j==W-1){
							System.out.print("#");
						}else{
							System.out.print(".");
						}
					}
				}
				System.out.print("\n");
			}
			System.out.print("\n");
		}
	}
}