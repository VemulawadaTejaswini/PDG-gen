import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		
		 long a =scn.nextLong();
		 long b =scn.nextLong();
		 long c = scn.nextLong();
		  long val1 =4*(a*b);
		  long val2 = c*c +(a+b)*(a+b)- 2*c*(a+b);
		  boolean flag=false;
		  if(c-(a+b)<0){
			  flag=true;
		  }
		  if(flag){
			  if(val1>val2){
				  System.out.println("Yes");
			  }else{
				  System.out.println("No");
			  }
		  }else{
		  if(val1<val2){
			  System.out.println("Yes");
		  }else{
			  System.out.println("No");
		  }
		  }
		  

	}

}