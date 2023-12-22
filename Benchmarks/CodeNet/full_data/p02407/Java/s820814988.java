import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int intInput = scan.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < intInput; i++){
			list.add(scan.nextInt());
		}
		for(int i = intInput - 1; 0 <= i; i--){
			System.out.print(list.get(i));
			if(i == 0){
				System.out.println();
			}else{
				System.out.print(" ");
			}
		}
		scan.close();
	}
}