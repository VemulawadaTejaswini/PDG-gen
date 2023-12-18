import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s =scn.next();
		String c =scn.next();
		
		if(s.length()!=c.length()-1){
			System.out.println("No");
			return;
		}
		for(int i=0;i<s.length();i++){
			char ch1=s.charAt(i);
			char ch2 =c.charAt(i);
			if(ch1!=ch2){
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		

	}

}