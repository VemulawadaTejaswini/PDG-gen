import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try{
			while(true) {
				String str=scan.next();
				if(str.equals("-")){
					break;
				}
				int x=scan.nextInt();
				String str1;
				String str2;
				for(int i=0;i<x;i++) {
					int a=scan.nextInt();
					str1=str.substring(0,a);
					str2=str.substring(a);
					str=str2+str1;
				}
				System.out.println(str);
			}
			scan.close();
		}catch(InputMismatchException e){
			System.out.println("入力しなおしてください");
		}
		}
}
