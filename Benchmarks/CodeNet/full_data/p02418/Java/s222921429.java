import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try{
			while(scan.hasNextLine()) {
				String str1=scan.nextLine();
				String str2=scan.nextLine();
				str1=str1+str1;
				int result=str1.indexOf(str2);
				if(result!=-1) {
					System.out.println("Yes");
				}
				else{
					System.out.println("No");
				}
			}
			scan.close();
		}catch(InputMismatchException e){
			System.out.println("入力しなおしてください");
		}
		}
}
