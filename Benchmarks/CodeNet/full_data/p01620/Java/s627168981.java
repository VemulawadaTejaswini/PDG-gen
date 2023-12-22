import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] keys = new int[n];
			for(int i = 0; i < n; i++){
				keys[i] = sc.nextInt();
			}
			
			char[] input = sc.next().toCharArray();
			
			for(int pos = 0; pos < input.length; pos++){
				final int use_key = pos % n;
				
				//System.out.println(use_key);
				
				char output = (char)(input[pos] - keys[use_key]);
				
				if('a' <= input[pos] && input[pos] <= 'z'){
					if(output < 'a'){
						output = (char)('Z' - ('a' - output - 1));
					}else if(output > 'z'){
						output = (char)('A' + (output - 'z' - 1));
					}
				}else{
					if(output < 'A'){
						output = (char)('z' - ('A' - output - 1));
					}else if(output > 'Z'){
						output = (char)('a' + (output - 'Z' - 1));
					}
				}
				
				input[pos] = output;
			}
			
			for(int i = 0; i < input.length; i++){
				System.out.print(input[i]);
			}
			System.out.println();
		}

	}

}