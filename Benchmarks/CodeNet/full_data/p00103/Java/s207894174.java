import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++){
			System.out.println(getPoint(sc));
		}
	}
	
	public static int getPoint(Scanner sc){
		int returnValue = 0;
		int outCount = 0;
		int runner = 0;
		while(true){
			String letter = sc.next();
			if(letter.equals("HIT")){
				if(runner < 3){
					runner += 1;
				}
				else{
					runner = 3;
					returnValue += 1;
				}
			}else if(letter.equals("OUT")){
				outCount += 1;
				if(outCount == 3){
					return returnValue;
				}
			}else if(letter.equals("HOMERUN")){
				returnValue += runner + 1;
				runner = 0;
			}
		}
	}
}