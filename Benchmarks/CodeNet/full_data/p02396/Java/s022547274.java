import java.util.Scanner;

class Main{
public static void main(String[] args){

	
	 int cnt=1;
	String  no= "Case";
	String  nn=":";
 
	Scanner s = new Scanner(System.in);
while(s.hasNext())
	{
		int a=s.nextInt();
		if(a==0){break;}
		System.out.println(no+cnt+ nn+a);
		cnt=cnt++;
		
		}
		
	}
	
}

	

	
