import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		String s=input.next();
		
		boolean yes=true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==s.charAt(s.length()-1-i)) {
				yes=true;
			}
			else {
				yes=false;
				break;
			}
		}
		if(yes)
			System.out.println("Yes");
		else
			System.out.println("No");
		
	}

}
