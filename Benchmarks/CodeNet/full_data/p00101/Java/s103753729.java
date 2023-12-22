import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		//while(scan.hasNext()){
			int n = scan.nextInt();
			while(n >= 0){
				String str = scan.nextLine();
				str = str.replaceAll("Hoshino","Hoshina");
				System.out.println(str);
				n--;
			}
		//}
	}
}