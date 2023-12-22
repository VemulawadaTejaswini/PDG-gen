//素数判定
package ALDS1_1_C;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		  Scanner cin=new Scanner(System.in);
		  List<Integer> list=new ArrayList<>();
		  int n=cin.nextInt();
		  for(int i=0;i<n;i++)list.add(cin.nextInt());
		  
		  int prime[]=new int[list.get(n-1)+1];
		  for(int i=2;i<=n;i++)prime[i]=1;
		  
		  for(int i=2;i<=Math.sqrt(list.get(n-1));i++) {
			  if(prime[i]==1) {
				  for(int j=i*2;i<=list.get(n-1);i++) {
					  if(j%i==0)prime[j]=0;
				  }
			  }
		  }
		  
		  int res=0;
		  for(int i=0;i<list.size();i++) {
			  if(prime[list.get(i)]==1)res++;
		  }
		  
		  System.out.println(res);
		  
	}

}

