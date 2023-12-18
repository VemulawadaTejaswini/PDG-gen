import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
	Scanner sc =new Scanner(System.in);
	
	int a= sc.nextInt();
	int b= sc.nextInt();	
	int k= sc.nextInt();
	int c=0,d=0;
	
	for(int i=0;i<k;i++){
		
		if(i%2==0){
			if(a%2==1) a=a-1;
			//System.out.println(a);
			c=a;
			a=a-c/2;
			
			//System.out.println(a);
			b=b+c/2;
		}
		
		else if(i%2==1){
			if(b%2==1) b=b-1;
			
			d=b;
			a=a+d/2;
			b=b-d/2;
		}
	
			
	}
	
	System.out.print(a+" "+b);
	
	}

}