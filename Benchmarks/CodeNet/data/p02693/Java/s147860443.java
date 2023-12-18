import java.util.*;
public class ATCODERMultiples {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
	        int a=in.nextInt();
	        int b=in.nextInt();
	        int c=in.nextInt();
	        boolean flag=false;
	        for(int i=b;i<=c;i++)
	        {
	        	if(i%a==0)
	        	{
	        		flag=true;
	        		break;
	        	}
	        }
	        System.out.println((flag==true)?"OK":"NG");    
	}

}
