import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		String s =scn.next();
		   res(s);

	}
	public static void res(String s){
		
		String s1= s.substring(0,s.length()/2);
	//	System.out.println(s1);
		String s2=s.substring((s.length()+2)/2);
	//	System.out.println(s2);
		if(ispaln(s1)&&ispaln(s2)&&ispaln(s)){
			System.out.println("Yes");
			return ;
		}
		
		
		System.out.println("No");
	}
	
	public static boolean ispaln(String s){
		int i=0;
		int j=s.length()-1;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j)){
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}