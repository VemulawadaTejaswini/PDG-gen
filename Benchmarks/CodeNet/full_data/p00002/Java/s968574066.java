import java.util.*;
class  Main
{
	public static void main(String[] args) 
	{
	int a,b,c,d,count;
	Scanner in=new Scanner(System.in);
	for(;;)
		{
	a=in.nextInt();
	b=in.nextInt();
		c=a+b;
		if(c>=0 && c<10)
		{
			count=1;
		}else{
		count=0;
		while(c>0)
			{
				c=c/10;
				++count;
			}
		}
	System.out.println(count);
		}	
	}
}