import java.util.Scanner;

public class Main{
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		sc.close();
		
		System.out.println(count(in));
	}
	
	static int count(String str){
		char now = str.charAt(0);
		int result = 0;
		for(char c: str.toCharArray()){
			if(now != c){
				now = c;
				result++;
			}
		}
		return result;
	}
}
