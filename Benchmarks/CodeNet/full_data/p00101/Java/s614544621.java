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
			System.out.println(str.replaceAll("Hoshino", "Hoshina"));
			n--;
		}
	}
}