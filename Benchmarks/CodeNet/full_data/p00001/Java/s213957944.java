import java.io.*;

public class Main {
	static public void main(String[] argv) {
		try{
//			FileReader file_in = new FileReader("test.txt");
//			BufferedReader d = new BufferedReader( file_in );
			BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
	
			int[] res = new int[3];
			res[0] = 0;
			res[1] = 0;
			res[2] = 0;
			
			while(true) {
				String str = d.readLine();
				if( str == null ) break;
				res = compare(Integer.valueOf(str), res);
			}
			
			printResult(res);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	static int[] compare(int input, int[] array) {
		if( input > array[0] ) {
			array[2] = array[1];
			array[1] = array[0];
			array[0] = input;
		} else if( input > array[1] ) {
			array[2] = array[1];
			array[1] = input;
		} else if( input > array[2] ) {
			array[2] = input;
		}
		return array;
	}
	
	static void printResult(int[] res) {
		System.out.println(res[0]);
		System.out.println(res[1]);
		System.out.println(res[2]);
	}
}