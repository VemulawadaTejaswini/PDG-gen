import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int H,W;
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		H=scan.nextInt();
		W=scan.nextInt();
		if((H==0) && (W==0))break;
		for(int i=0;i<H;i++)
		    {
		
			for(int j=0;j<W;j++)
			    {
				if((i%2==0) && (j%2==0) || (i%2!=0) && (j%2!=0))System.out.print("#");
				else System.out.print(".");
			    }
			System.out.println();
		    }
		System.out.println();
	    }
    }
}