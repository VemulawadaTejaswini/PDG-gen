import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
	
		int a= reader.nextInt();
		int b= reader.nextInt();
		int c= reader.nextInt();
		int t=a+b+c;
	   if (t%2==0) {
		   System.out.print("YES");
	   }
	   else {
		   System.out.print("NO");
	   }
		
		
	}
	
	

}