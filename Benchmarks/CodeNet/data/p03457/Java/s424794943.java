

import java.util.*;

class Main{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int flag=0;
		int X=0,Y=0,T=0;
		while(n-->0)
		{
		    int t=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    if((Math.abs(Math.abs(X-x)+Math.abs(Y-y)-t+T)%2==0)&&((Math.abs(X-x)+Math.abs(Y-y))<=(t-T)))
		    {
		        X=x;
		        Y=y;
		        T=t;
		    }
		    else{
		        flag=1;
		        break;
		    }
		}
		if(flag==0)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}
		