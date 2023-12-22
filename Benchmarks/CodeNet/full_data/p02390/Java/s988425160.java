import java.util.Scanner;


class Main { 
  public static void main(String[] args)

{
	Scanner stdIn=new Scanner(System.in);
	int S = stdIn.nextInt();
	int h,m,s;
	
	
	
	h=S/3600;
	int i=S-(3600*h);
	m=i/60;
	s=i-(60*m);
	
	
	System.out.println(h+":"+m+":"+s);
	
	
	
  }
}