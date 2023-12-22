
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		try{
			while(true){
				char[] romanValue = br.readLine().toCharArray();
				result.add(parseInt(romanValue));
			}
		}catch(Exception e){
			//何もしないで出力処理に移る
		}
		
		for(int n : result){
			System.out.println(n);
		}
	}
	
	public static int parseInt(char romanValue){
		int value = 0;
		switch(romanValue){
		case 'I':
			value = 1;
			break;
		case 'V':
			value = 5;
			break;
		case 'X':
			value = 10;
			break;
		case 'L':
			value = 50;
			break;
		case 'C':
			value = 100;
			break;
		case 'D':
			value = 500;
			break;
		case 'M':
			value = 1000;
			break;
		}
		return value;
	}
	
	private static int[] getNumbers(char[] romanValue){
		int[] numbers = new int[romanValue.length];
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = parseInt(romanValue[i]);
		}
		
		//大きい数字の前にある小さな数は負数
		if(numbers.length > 1){
			for(int i = 1; i < numbers.length; i++){
				if(numbers[i] > numbers[i - 1]){
					numbers[i - 1] *= -1;
				}
			}
		}
		
		return numbers;
	}
	
	public static int parseInt(char[] romanValue){
		int value = 0;
		int[] numbers = getNumbers(romanValue); 
		for(int i = 0; i < numbers.length; i++){
			value += numbers[i];
		}
		return value;
	}
	
}