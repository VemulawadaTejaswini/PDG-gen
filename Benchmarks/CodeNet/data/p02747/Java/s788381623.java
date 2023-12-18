import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		if(res(s)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
	public static boolean res(String s){
		
		if(s.length()%2!=0){
			return false;
		}
		for(int i=0;i<s.length();i+=2){
			if(s.charAt(i)=='h' && s.charAt(i+1)=='i'){
				
			}else{
				return false;
			}
		}
		
		
		return true;
	}

}