package a0009_Prime_Number;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private static final int MAX_ARRAY = 30;
	private static final int MAX_INPUT = 999999;
	private static final int MIN_INPUT = 1;
	
	private static ArrayList<Integer> array = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("#######INPUT#######");
		input();
		
		//System.out.println("#######OUTPUT#######");
		//showArray();
		showResult();
	}
	
	public static void input(){
		Scanner stdIn = new Scanner(System.in);
		
		while(stdIn.hasNext()){
			String buf = stdIn.next();
			if(isNumber(buf)){
				int tmp = Integer.parseInt(buf);
				if(MIN_INPUT <= tmp && tmp <= MAX_INPUT){
					array.add(tmp);
				}
			}
			if(array.size() == MAX_ARRAY){
				break;
			}
		}
		
		stdIn.close();
	}
	
	public static void showArray(){
		for(Integer i : array){
			System.out.println(i);
		}
	}
	
	public static void showResult(){
		for(Integer i : array){
			System.out.println(isPrimeCount(i));
		}
	}
	
	public static int isPrimeCount(int num){
		int count = 0;
		
		for(int i = 1;i <= num;i++){
			if(isPrimeF(i)){
				count++;
			}
		}
		
		return count;
	}
	
	public static boolean isPrime(int num){
		if(num == 1){
			return false;
		}else{
			for(int i = 2;i <= num-1;i++){
				if(num % i == 0){
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean isPrimeF(int num){
		if(num == 2){
			return true;
		}
		if(num < 2 || num % 2 == 0){
			return false;
		}
		for(int i = 3;i <= Math.sqrt(num);i = i+2){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNumber(String num){
		try{
			Integer.parseInt(num);
			return true;
		}catch(NumberFormatException ex){
			return false;
		}
	}

}