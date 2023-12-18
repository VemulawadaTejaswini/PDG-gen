import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
    int t,n,i,j,l;

        n=in.nextInt();
l=in.nextInt();

        int w[]=new int[n];
int v[]=new int[n];
int p[][]=new int[n+1][l+1] ;
        	for(i=0;i<n;i++)
            {
                w[i]=in.nextInt();
v[i]=in.nextInt();
            }
            for(i=0;i<=n;i++)
            {
                for(j=0;j<=l;j++)
                {
                    p[i][j]=-1;
                }
            }

Main ob=new Main();
System.out.println(ob.count(w,v,n,l,p));	

    
	
}
int count(int w[],int v[],int n, int l,int p[][])
{
if(n==0||l==0)
return 0;
    if(p[n][l]!=-1)
        return p[n][l];

if(w[n-1]<=l)
{
        p[n][l]=Math.max(v[n]+count(w,v,n-1,l-w[n],p),count(w,v,n-1,l,p));
          return(p[n][l]);
}
else
{
    return(count(w,v,n-1,l,p));
   
}

}
}