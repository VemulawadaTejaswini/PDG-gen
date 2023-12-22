import java.util.Scanner;

class Main{
public static void main(String[] args){

	
	int cnt=1;
 
	Scanner s = new Scanner(System.in);
for(int q=0;q<10000;q++)
	{
		int a=s.nextInt();
		if(a==0){break;}
		System.out.println("Case "+cnt+ ":"+ " "+a);
		cnt=cnt++;
		
		}
		
	}
	
}

	

