import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int count[]=new int[6];
	for(int i=0;i<n;i++)
	    {
		float high=scan.nextFloat();
		if(high<165.0)count[0]++;
		if(165.0<=high && high<170.0)count[1]++;
		if(170.0<=high && high<175.0)count[2]++;
		if(175.0<=high && high<180.0)count[3]++;
		if(180.0<=high && high<185.0)count[4]++;
		if(185.0<=high)count[5]++;
	    }
	for(int i=0;i<6;i++)
	    {
		System.out.print((i+1)+":");
		    for(int j=0;j<count[i];j++)
		    {
			System.out.print("*");
		    }
		System.out.println();
	    }
    }
}