import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		try{
			while(true) {
				String str=scan.next();
				int x=scan.nextInt();
				int b=str.length();
				String str1;
				String str2;
				for(int i=0;i<x;i++) {
					int a=scan.nextInt();
					str1=str.substring(0,a);
					System.out.println("途中経過"+str1);
					str2=str.substring(a,b);
					System.out.println("途中経過"+str2);
					str=str2+str1;
				}
				System.out.println(str);
				if(str.equals("-")){
					break;
				}
			}
			scan.close();
		}catch(InputMismatchException e){
			System.out.println("入力しなおしてください");
		}
		}
}
