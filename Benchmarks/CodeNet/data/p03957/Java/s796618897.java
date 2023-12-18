import java.util.Scanner;
import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);	
		
		String str = scan.next();
		boolean f = true;
		
		for(int i = 0 ;  i < str.length() ;i++){
			if(f){
				if(str.charAt(i) == 'C'){
					f = false;
				}
			} else {
				if(str.charAt(i) == 'F'){
					System.out.println("Yes");
					break;
				} else {
					System.out.println("No");
				}
			}
		}
		if(f){
			System.out.println("No");
		}
		
	}
}
