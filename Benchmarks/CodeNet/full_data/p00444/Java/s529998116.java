import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
	Scanner scan=new Scanner(System.in);
	while(true)
	    {
	int x=scan.nextInt();
	if(x==0)break;
	int n,count=0;
	n=1000-x;
	count+=n/500;
	n%=500;
	count+=n/100;
	n%=100;
	count+=n/50;
	n%=50;
	count+=n/10;
	n%=10;
	count+=n/5;
	n%=5;
	count+=n;
	System.out.println(count);
	    }
    }
}