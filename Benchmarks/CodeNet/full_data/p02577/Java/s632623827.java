import java.util.*;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	
	public static void main(String []args){
		
		String num=sc.nextLine();
		int reminder=0;
		for(int i=0;i<num.length();i++){
			reminder+=num.charAt(i)-'0';
			if(reminder>=9)
				reminder-=9;
		}
		if(reminder==0)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
}