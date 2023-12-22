import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int  s;
		while(true){
	int	 a = scan.nextInt();
	int b=scan.nextInt();
	int c=scan.nextInt();
if(a==-1&&b==-1&&c==-1)
	break;
	s=a+b;
	if(a!=-1&&b!=-1){
		if(s>=80)
			System.out.println("A");
		else if(s>=65)
			System.out.println("B");
		
		else if(s>=50)
			System.out.println("C");
			
		else if(s>=30&&c>=50)
			System.out.println("C");
			
		else if(s>=30)
			System.out.println("D");
			
		else 
			System.out.println("F");
		
	}
	else
		System.out.println("F");
	
		}
	}
}