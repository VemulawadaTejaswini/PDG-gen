import java.util.*;
public class Main {
static double a[]=new double [1100];
final static double eqs=1e-8;
  public static void main(String args[])
  {
	  Scanner input=new Scanner(System.in);
	  int n,m;
	  n=input.nextInt();m=input.nextInt();
	  double sum=0;
	  for(int i=1;i<=n;i++)
	  {
		  a[i]=input.nextDouble();sum+=a[i];}
	  double limt=sum/(4.0*m);
	  Arrays.sort(a,1,1+n);
	  for(int i=n;i>=1;i--)
	  {
		  
		  if(a[i]-limt>eqs)m--;
		  else
			  break;
		  if(m==0)break;
	  }
	  if(m==0)System.out.println("Yes");
	  else
		  System.out.println("No");
  }
}