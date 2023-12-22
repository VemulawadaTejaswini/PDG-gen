import java.util.*;
class Main
{
	public static void main(String mad[])
    {
		int N;
      	Scanner sc=new Scanner(System.in);
          
          N=sc.nextInt();
      	int x[]=new int[N];
      	int y[]=new int[N];
      	for(int i=0;i<N;i++)
        {
			x[i]=sc.nextInt();
          	y[i]=sc.nextInt();
        }
      	int distance=-1;
      	int firstterm;
      	int secondterm;
      	int tempdist;
      	for(int i=0;i<N;i++)
        {
			for(int j=i+1;j<N;j++)
            {
               	firstterm=find(x[i],x[j]);
              	secondterm=find(y[i],y[j]);
              	tempdist=firstterm+secondterm;
              	if(tempdist>distance)
                {
                  distance=tempdist;
                }
            }
        }
      	System.out.println(distance);
    }
  public static int find(int a,int b)
  {
	int	diff=a-b;
    	if(diff>0)
        {
			return diff;
        }
    	else
        {
			return diff*(-1);
        }
  }

    
  
  
  
  
  
}
