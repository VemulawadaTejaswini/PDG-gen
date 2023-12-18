import java.io.*;
class Main {
 public static void main(String[] args) throws IOException{
	try ( BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ){
		final int target = Integer.parseInt( br.readLine() );
		int counter = 0;

		for( int i = 3; i <= target; i+=2 ){
			int tmpCnt = 0;
			for( int j = 1 ; j <= i ; j+=2 ){
				if( i%j == 0 ){
					tmpCnt++;	
				}
			}
//			System.out.println(i + ", " +tmpCnt);
			if( tmpCnt == 8 ){
				counter++;
			}
		}

		System.out.println(counter);

	}


 }
}