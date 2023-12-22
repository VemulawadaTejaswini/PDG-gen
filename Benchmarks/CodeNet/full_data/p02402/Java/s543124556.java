import java.io.*;

public class Main{
	public static void main(String[] args)throws IOException, NumberFormatException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt( br.readLine() );
		String[] data = br.readLine().split(" ");
		int[] values = new int[number];
		
		for( int i=0 ; i<number ; i++ ){
			values[i] = Integer.parseInt( data[i] );
		}
		
		int sum = 0;
		int max = values[0];
		int min = values[0];
		for( int e : values ){
			sum += e;
		}
		for( int i=0 ; i<(number-1) ; i++ ){
			if( values[i] < values[i+1] ) max = values[i+1];
			if( values[i] > values[i+1] ) min = values[i+1];
		}
		
		StringBuilder builder = new StringBuilder();
		builder
			.append(min)
			.append(" ")
			.append(max)
			.append(" ")
			.append(sum);
		System.out.println(builder);

	}
}