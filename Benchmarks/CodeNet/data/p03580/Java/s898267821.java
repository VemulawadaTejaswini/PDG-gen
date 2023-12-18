import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		int count = 0;
		char[] array = br.readLine().toCharArray();
		
		while(true){
			int index = search101(array);
			
			if(index < 0){
				break;
			}
			
			changeTo010(array, index);
			count++;
		}
		
		System.out.println(count);
	}
	
	static void changeTo010(char[] input, int index){
		input[index] = '0';
		input[index + 1] = '1';
		input[index + 2] = '0';
	}
	
	static int search101(char[] input){
		int n = input.length;
//		System.out.println(n);
		for(int i = n - 3; i >= 0 ; i--){
//			System.out.print(input[i]);
			if(input[i] == '1' && input[i + 1] == '0' && input[i + 2] == '1'){
//				System.out.println("hit "+i);
				return i;
			}
		}
		
		return -1;
	}

}
