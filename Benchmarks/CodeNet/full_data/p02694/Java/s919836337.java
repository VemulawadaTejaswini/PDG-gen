import java.util .*;
class Main
{
    public static void main (String args[ ])
{
	int i=100;
	int r=1;
	int t=0;
	int x;
	double k = 0;
	Scanner scan = new Scanner(System.in);
		  
		 // Read the next integer from the screen 
		 	x= scan.nextInt(); 
	
    for(int j=0;;j++)
	{
	if(x<k)
	break;
	else
	{
	k=100 + (100* Math.pow(1.0+1/100.0,t) - 100);
	}
	t++;
	}
    
    System.out.print(t);
   }
    
}
