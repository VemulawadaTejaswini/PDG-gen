import java.util.*;
class Main
{
	public static void main(String[] args) 
    { 	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	float m=n/3;
    	float sum=1;
    	for(int i=0;i<3;i++)
    	{
    		sum=sum*m;
    	}
    	//System.out.println(sum);
    	System.out.format("%.6f%n", sum);

         
    } 
    
}
