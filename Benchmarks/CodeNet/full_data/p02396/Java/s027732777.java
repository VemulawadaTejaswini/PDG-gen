import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	int i,j=1;
	while(true)
	    {
		
		Scanner scan=new Scanner(System.in);
		i=scan.nextInt();
		if(i==0)break;
		System.out.println("Case "+j+": "+i);
		j++;
	    }
    }
}