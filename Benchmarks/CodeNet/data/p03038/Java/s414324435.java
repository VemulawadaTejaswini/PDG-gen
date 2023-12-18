import java.util.*;
public class Main{
 	public static void main(String args[]){
     	Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
     long a[]=new long[n];
      for(int i=0;i<n;i++){
       a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      for(int i=1;i<=m;i++){
       	int b=sc.nextInt();
		int c=sc.nextInt();
		int f=0;
		for(int j=0;j<b;j++){
			if(a[j]>=c)
				break;
			f=1;
			a[j]=c;
		}
		if(f==1)
			Arrays.sort(a);
      }
	  	long sum=0;
		for(int i=0;i<n;i++){
			sum+=a[i];
		}
      System.out.println(sum);
    }
}