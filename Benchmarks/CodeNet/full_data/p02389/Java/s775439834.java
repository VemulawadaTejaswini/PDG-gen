import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String input = sc.nextLine();
		String[] inputArray = input.split(" ");

		if(inputArray.length == 2){
			int width = Integer.parseInt(inputArray[0]);
			int height = Integer.parseInt(inputArray[1]);
			
			int menseki = width * height;
			int syuu = width * 2 + height * 2;
			System.out.println(menseki + " " + syuu);
		}else{
			System.out.println("2???????????¶??°?????\?????????????????????");
		}
	}
}