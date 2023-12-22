import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number[] = new int[30];
		int notSubmitted  = 2;
		
		for(int i = 0 ; i < number.length-notSubmitted  ; i++) {
			int num = scan.nextInt();
			++number[num-1];
		}
		for(int i = 0 ; i < number.length ; i++) {
			if(number[i] == 0) {
				System.out.println(i+1);
			}
		}
	}

}

