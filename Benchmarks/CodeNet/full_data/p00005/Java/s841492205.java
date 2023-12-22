
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	
	private static ArrayList<Long> gcd = new ArrayList<Long>();
	private static ArrayList<Long> lcm = new ArrayList<Long>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
			while(sc.hasNextLong()){
				long a = sc.nextLong();
				long b = sc.nextLong();
				gcd.add(getGCD(a, b));
				lcm.add(getLCM(a, b));
			}
		}catch(NoSuchElementException e){
			//ツ禿シツ療債づ個終ツづュツづィツつェツ禿シツ療債つウツづェツつスツづァツ篠淞づ個コツーツドツづ鳴渉按猟敖づーツ進ツづ淞づゥ
		}
		
		//ツ催妥・ツ古カツ姪アツ青板δ環スツトツづ催渉ャツ古カツ倍ツ青板δ環スツトツづーツ出ツ療債つキツづゥ
		int sizeAnswerList = gcd.size();
		for(int i = 0; i < sizeAnswerList; i++){
			System.out.println(gcd.get(i) + " " + lcm.get(i));
		}
	}
	
	private static long getGCD(long a, long b){
		long numBigger;
		long numSmaller;
		if(a > b){
			numBigger = a;
			numSmaller = b;
		}
		else{
			numBigger = b;
			numSmaller = a;
		}
		
		long gcd;
		while(true){
			if(numBigger == numSmaller){
				gcd = numBigger;
				break;
			}
			long tmp = numBigger;
			numBigger = numSmaller;
			numSmaller = tmp - numSmaller;
			if(numBigger < numSmaller){
				tmp = numBigger;
				numBigger = numSmaller;
				numSmaller = tmp;
			}
		}
		
		return gcd;
	}
	
	private static long getLCM(long a, long b){
		long tmp = b / getGCD(a, b);
		return a * tmp;
	}
}