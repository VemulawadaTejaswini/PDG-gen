import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(scan.hasNext()){
			if(n == 0){
				break;
			}
			String str = scan.nextLine();
			str = str.replaceAll("Hoshina", "@@@@@");
			str = str.replaceAll("Hoshino", "Hoshina");
			str = str.replaceAll("@@@@@" , "Hoshino");
			System.out.println(str);
			n--;
		}
	}
}