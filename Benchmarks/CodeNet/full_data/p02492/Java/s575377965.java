import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		int i=1; 
		int x=0;
		int y=0;
		while(i==1){
			Scanner s = new Scanner(System.in);
			 x=s.nextInt();
			String op =s.next();
			 y=s.nextInt();
			int ans=0;
	    
			if(op.equals("+")){
				ans=x+y;
				System.out.println(ans);
			}
			else if(op.equals("-")){
				ans=x-y;
				System.out.println(ans);
			}

			else if(op.equals("*")){
				ans=x*y;
				System.out.println(ans);
			}
			else if(op.equals("/")){
				if(y!=0){
				ans=x/y;
				System.out.println(ans);
				}
			}
			else if(op.equals("?")){
				i=0;
			}

		
		}		
	}
}