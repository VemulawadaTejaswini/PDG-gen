import java.util.*;
public class Main {
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int NS = 0;
		int EW = 0;
		String s = scanner.nextLine();
		for(int i = 0; i < s.length(); i++){
			if (s.charAt(i) =='N') {
				NS++;
			}else if (s.charAt(i) =='E'){
				EW++;
			}else if (s.charAt(i) =='W'){
				EW--;
			}else if (s.charAt(i) =='S'){
				NS--;
			}
		}
		if(NS == 0 && EW == 0){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
	}
}
