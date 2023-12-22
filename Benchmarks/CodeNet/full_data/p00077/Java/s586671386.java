import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		while(true){
			String charLine = stdIn.next();
			for(int i = 0;i < charLine.length();i++){
				if(charLine.charAt(i) == '@'){
					i++;
					for(int j = 0;j < Integer.parseInt(""+charLine.charAt(i)); j++){
						System.out.print(charLine.charAt(i + 1));
					}
					i++;
				}else{
					System.out.print(charLine.charAt(i));
				}
			}
		}
	}
}