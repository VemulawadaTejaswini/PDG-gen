import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static final int MAX = 80000;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[MAX];
		
		while(true){
			final String input = sc.next();
			
			if("0".equals(input)){
				break;
			}
			
			final int size = input.length();
			
			for(int i = 0; i < size; i++){
				numbers[i] = input.charAt(i) - '0';
				//System.out.println(numbers[i]);
			}
			
			int count = 0;
			for(int end = size - 1; end >= 0; end--){
				int num = 0;
				
				boolean is_zero = true;
				for(int pos = 0; pos <= end; pos++){
					num += pos % 2 == 0 ? numbers[end - pos] : -numbers[end - pos];
					
					if(is_zero && numbers[end - pos] != 0){
						is_zero = false;
					}else if(numbers[end - pos] == 0){
						continue;
					}
					
					if(num < 0){
						num += 11;
					}else if(num >= 11){
						num -= 11;
					}
					
					if(num == 0 && !is_zero){
						//System.out.println((end - pos) + " " + end);
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
		
	}

}