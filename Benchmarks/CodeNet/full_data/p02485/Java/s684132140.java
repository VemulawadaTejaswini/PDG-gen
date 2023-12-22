import java.util.ArrayList;
import java.util.Scanner;
import java.lang.*;


public class Main {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Integer> result = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		while(sc.hasNextLine()){
			String input = sc.nextLine();
			if(input.charAt(0) == '0'){
				break;
			}
			else{
				result.add(getSum(input));
			}
		}
		
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	
	private static int getSum(String str){
		int sum = 0;
		for(int i = 0; i < str.length(); i++){
			String c = String.valueOf(str.charAt(i));
			sum = sum + Integer.parseInt(c);
		}
		return sum;
	}
}