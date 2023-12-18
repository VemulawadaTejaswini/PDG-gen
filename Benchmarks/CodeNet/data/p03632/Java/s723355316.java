import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int aliceStartTime = scan.nextInt();
		int aliceStopTime = scan.nextInt();
		int bobStartTime = scan.nextInt();
		int bobStopTime = scan.nextInt();
		
		if(aliceStartTime <= bobStartTime && aliceStopTime <= bobStartTime
				|| bobStartTime <= aliceStartTime && bobStopTime <= aliceStartTime){
			System.out.println("0");
		}
		if(bobStartTime <= aliceStartTime && aliceStopTime >= bobStopTime){
			System.out.println(bobStopTime - bobStartTime);
		}
		if(aliceStartTime <= bobStartTime && bobStopTime >= aliceStopTime){
			System.out.println(aliceStopTime - aliceStartTime);
		}
		if(aliceStartTime <= bobStartTime){
			System.out.println(aliceStopTime - bobStartTime);
		}
		if(bobStartTime <= aliceStartTime){
			System.out.println(bobStopTime - aliceStartTime);
		}else{
			System.out.println("エラー");
		}
	}
}