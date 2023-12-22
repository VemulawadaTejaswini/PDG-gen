import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner input = new Scanner(System.in)){
			int number = Integer.parseInt(input.nextLine());
			String str = input.nextLine();
			solution(number, str);
		}
	}
	public static void solution(int number, String str){
		if (str.length() <= number){
			System.out.println(str);
		}
		else{
			String ans = "";
			for (int i =0; i <number;i++){
				ans+=str.charAt(i);
			}
			ans+="...";
			System.out.println(ans);
		}
		
	}
}
