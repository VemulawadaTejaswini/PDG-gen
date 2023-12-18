
import java.util.Scanner;
public class Main{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();
        long c=in.nextLong();
        long ans=0,ctr=1,max=-1;
        while(ctr<=c)
        {
        	ans=(int)((a*ctr)/b)-(int)(a*(int)(ctr/b));
        	if(ans>=max)
        	{
        		max=ans;
        	}
        	ctr++;
        }
        System.out.println(max);
	}

}
