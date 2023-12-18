import java.util.Scanner;

public class Main {

	static public String solve(String str){

		
		for(int i = 0; i < str.length(); i++){
			if(i > 0){
				if(str.charAt(i) == str.charAt(i-1))
					return (i) +" " + (i+1);
			}
			if(i > 1){
				if(str.charAt(i) == str.charAt(i-2)){
					return (i-1) + " " + (i+1);
				}
			}
		}
		return "-1 -1";
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();

		System.out.println(solve(str));
		
	}

}
