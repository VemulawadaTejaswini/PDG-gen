import java.util.ArrayList;
import java.util.Scanner;


public class Main{
	Scanner sc;
	public void run(){
		sc = new Scanner(System.in);
		ArrayList<Integer> n = new ArrayList<Integer>();

		
			String s = sc.nextLine();
			for(int i = 0; i < s.length(); i++){
				char c = s.charAt(i);
				if(Character.isUpperCase(c)){
					System.out.print(Character.toLowerCase(c));
				}
				else if(Character.isLowerCase(c)){
					System.out.print(Character.toUpperCase(c));
				}
				else System.out.print(c);
			}
		System.out.println();
	}
	public static void main(String[] args){
		new Main().run();
	}
}