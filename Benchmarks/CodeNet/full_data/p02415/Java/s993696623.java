import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String work = "";
		for(int i = 0; i < input.length(); i++){
			work = input.substring(i,i+1);
			if(Character.isUpperCase(work.charAt(0))){
				System.out.print(work.toLowerCase());
			}else{
				System.out.print(work.toUpperCase());
			}
		}
		System.out.println("");
	}
}