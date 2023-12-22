import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
		int sum=0;
		int n=scan.nextInt();
		if(n==0)break;
		for(int i=0;i<n;i++)
		    {
			int w=0;
			for(int j=0;j<4;j++)
			    {
			
			w=scan.nextInt();
			    }
			if(w<=2)sum+=600;
			else if(2<w && w<=5)sum+=800;
			else if(5<w && w<=10)sum+=1000;
			else if(10<w && w<=15)sum+=1200;
			else if(15<w && w<=20)sum+=1400;
			else if(20<w && w<=25)sum+=1600;
		    }
		System.out.println(sum);
	    }
    }
}