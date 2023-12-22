
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	private static final int MAX_NUM = 100;
	private static int[] numInput = new int[MAX_NUM];
	private static ArrayList<Integer> result = new ArrayList<Integer>(1);
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try{
			while(true){
				checkInput(sc.nextInt());
			}
		}catch(NoSuchElementException e){
			//ツ禿シツ療債づ個終ツ猟ケ
		}
		
		addNumMostInput();
		
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
	
	//ツ鳴シツ前ツつィツつゥツつオツつ「ツ？
	private static void checkInput(int input){
		numInput[input - 1]++;
	}
	
	private static void addNumMostInput(){
		int maxTimesInput = getMaxTimesInput();
		for(int i = 0; i < MAX_NUM; i++){
			if(numInput[i] == maxTimesInput){
				result.add(i + 1);
			}
		}
	}
	
	private static int getMaxTimesInput(){
		int count = 0;
		for(int i = 0; i < MAX_NUM; i++){
			if(count < numInput[i]){
				count = numInput[i];
			}
		}
		return count;
	}
}