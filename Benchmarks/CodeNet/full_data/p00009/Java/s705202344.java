
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> inputs = new ArrayList<Integer>();
		
		setInputs(inputs);
		
		ArrayList<Integer> results = new ArrayList<Integer>();
		
		//nÜÅÌfÌðÊXgÉÇÁ·é
		for(int i = 0; i < inputs.size(); i++){
			results.add(getNumPrimeNumbers(inputs.get(i)));
		}
		
		//ÊðoÍ·é
		for(int i = 0; i < results.size(); i++){
			System.out.println(results.get(i));
		}
	}
	
	private static void setInputs(ArrayList<Integer> inputs){
		Scanner sc = new Scanner(System.in);
		
		try{
			while(sc.hasNextInt()){
				inputs.add(sc.nextInt());
			}
		}catch(NoSuchElementException e){
			//EOF,EOTªüÍ³ê½ç½à¹¸ðÖißé
		}
	}
	
	private static boolean isPrimeNumber(int n){
		if(n == 2){
			return true;
		}
		else if(n % 2 == 0){
			return false;
		}
		
		for(int i = 3; i  * i < n; i = i + 2){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	private static int getNumPrimeNumbers(int n){
		int count = 0;
		for(int i = 2; i < n + 1; i++){
			if(isPrimeNumber(i)){
				count++;
			}
		}
		
		return count;
	}
}