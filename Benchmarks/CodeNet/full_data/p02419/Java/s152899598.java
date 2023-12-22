import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String str1=scan.next().toUpperCase();
		int count=0;
		try{
			while(true) {
				String str=scan.next().toUpperCase();
				if(str.equals(str1)) {
					count++;
				}
				if(str.equals("END_OF_TEXT")){
					break;
				}
			}
			System.out.println(count);
			scan.close();
		}catch(InputMismatchException e){
			System.out.println("入力しなおしてください");
		}
		}
}
