import java.util.*;

class Main { 
  public static void main(String[] args)

{
	Scanner sc=new Scanner(System.in); 
	String input=sc.nextLine();
	String[] inputArray =input.split(" ");
	
		int a = Integer.parseInt(inputArray[0]);  
    	int b = Integer.parseInt(inputArray[1]);
    	int c = Integer.parseInt(inputArray[2]);
		
		
		if(a>b)
		{
			int t=a;
			a=b;
			b=t;
		}
		
		if(b>c)
		{
			int t=c;
			c=b;
			b=t;
		}
		
		if(a>b)
		{
			int t=a;
			a=b;
			b=t;
		}
		
		System.out.println(a+" "+b+" "+c);
}

}