import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			for(int i = 0;i < str.length();i++){
				int t = (int)str.charAt(i) - 3;
				System.out.print((char)((t < 65)?t+26:t));
			}
			System.out.println();
		}
	}
}