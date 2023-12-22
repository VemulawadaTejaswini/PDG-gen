import java.util.Scanner;

class Main{
  public static void main(String[] args){
	  int x , y;
	  String s;
	  Scanner sc = new Scanner(System.in);
	  for(;;){
		  x=sc.nextInt();
		  s=sc.next();
		  y=sc.nextInt();
		  if(s.equals("?")){
		   break;
		  } else if(s.equals("+")) {
			  System.out.println(x+y);
		  }else if(s.equals("-")){
			  System.out.println(x-y);
		  }else if(s.equals("*")){
			  System.out.println(x*y);
		  }else if(s.equals("/")){
			  System.out.println(x/y);
		  }
	  }
  }
}