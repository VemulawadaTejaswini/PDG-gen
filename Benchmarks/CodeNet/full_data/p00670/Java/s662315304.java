import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		for(;;)
		{
			int n=in.nextInt();
			int S=in.nextInt();
			if((n|S)==0)
				return;
			int a[]=new int[n];
			int[] r = new int[101];
			while(n--!=0)r[in.nextInt()]++;
			int res = 0;
			for(int i=1;i<101;i++)for(int j=i;j<101;j++){
				if(S<i+j){
					if(i==j)res+=r[i]*(r[i]-1)/2;
					else res+=r[i]*r[j];
				}
			}
			System.out.println(res);
		}
	}
}