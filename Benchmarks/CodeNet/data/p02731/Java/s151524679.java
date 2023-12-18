import java.util.*;
class Main
{
	public static void main(String[] args) 
    { 	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	double m=n/3;
    	double sum=1.0;
    	for(int i=0;i<3;i++)
    	{
    		sum=sum*m;
    	}

    	//System.out.println(sum);
    	System.out.format("%.10f", sum);

         
    } 
    
}
