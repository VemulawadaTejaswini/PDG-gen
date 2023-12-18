package first;

import java.util.Scanner;

public class Comp1 {

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		String S=sc.next();
		int flag=0;
		if(S.length()==6){
			if(S.equals(S.toLowerCase())){
					if(S.charAt(2)==(S.charAt(3)) && S.charAt(4)==(S.charAt(5))){
						flag=1;
						System.out.println("Yes");
					}else{
						System.out.println("No");
					}
			}else{
				System.out.println("Please enter lower case");
			}
			
			
		}else{
			System.out.println("Entered string should be 6 digits");
		}
	}
}
