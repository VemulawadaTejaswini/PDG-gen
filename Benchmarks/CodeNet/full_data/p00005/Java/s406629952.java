import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int max = Math.max(a, b);
			int min = Math.min(a, b);
			
			int yakusu = 0;
			int cal = 0;
			
			for(;true;){
				cal = max % min;
				max = min;
				min = cal;
				
				if(min==0){ 
					yakusu = max;
					break;
				}
			}
			
			int baisu = 0;
			baisu = a * b / yakusu;
			
			System.out.println(yakusu+" "+baisu);
		}			
	}
}