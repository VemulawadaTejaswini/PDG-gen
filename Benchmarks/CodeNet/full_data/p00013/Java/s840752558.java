import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int i=0;
	int a[]=new int[20];
	while(scan.hasNext())
	    {
		if(i>=20)break;
		
			a[i]=scan.nextInt();
			if(a[i]==0)
			    {
				int j=i;
				
				while(true)
				    {
					if(j<0)break;
					else if(a[j]!=0)
					    {
						System.out.println(a[j]);
						a[j]=0;
						break;
					    }
					
					j--;
					
				    }
			    }
			i++;
			System.out.println(i);
	    }
    }
}