import java.util.*;

public class Main 
{
	final static int MAX=100005;
	static Pp[] object=new Pp[MAX];
	static int head,tail;
	public static void main(String[]args)
	{
		
		Scanner scanner=new Scanner(System.in);
		int sum=0,c;
		int q,n;
		Pp u;
		n=scanner.nextInt();
		q=scanner.nextInt();

		for(int i=1;i<=n;i++ )
		{
			object[i]=new Main().new Pp();
			object[i].name=scanner.next();
			object[i].t=scanner.nextInt();
		}
		
		head=1;tail=n+1;
		while(head!=tail)
		{
			u=dequeue();
			c=min(q,u.t);
			u.t-=c;
			sum+=c;
			if(u.t>0)
			{
				enqueue(u);
			}else {
				System.out.println(u.name+" "+sum);
			}
		}
		
		
		
		
	}
	
	static void enqueue(Pp x)
	{
		object[tail]=x;
		tail=(tail+1)%MAX;
		
	}
	
	static Pp dequeue()
	{
		Pp x=object[head];
		head=(head+1)%MAX;
		return x;
	}
	
	static int min(int a,int b)
	{
		return a<b?a:b;
	}
	
	public  class Pp
	{
		 String name;
		 int t;		
	}
	




}