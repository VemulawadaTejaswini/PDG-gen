import java.util.Scanner;

class Main{
public static void main(String[] args){

	
	int cnt=1;
 
	Scanner s = new Scanner(System.in);
	while(s.hasNext())
	{
		int a=s.nextInt();
		if(a==0){break;}
		System.out.println("case "+cnt+ ":"+ " "+a);
		cnt=cnt++;
			
		}
		
	}
	
}

