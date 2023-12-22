import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int w=scan.nextInt();
		if(w==-1)break;
		int s[]={125,140,160};
		
		int fee=1150;
		
		int i=0;
		while(true)
		    {
			
			if(w<=10 && i==0)break;
			w-=10;
			
			if(w<=10 || i==3)
			    {
				fee+=w*s[i];
				break;
			    }
			
			else if(w>10)
			    {
				
				fee+=10*s[i];
				
			    }
			
			i++;
		    }
		System.out.println(4280-fee);
	    }
    }
}