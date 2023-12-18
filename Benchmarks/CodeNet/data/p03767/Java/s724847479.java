

import java.util.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayList<Integer>a=new ArrayList<Integer>();
    ArrayList<Integer>b=new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);

	int n=sc.nextInt();
	int i;
	for( i=0;i<3*n;i++)
	{
	a.add(sc.nextInt());	
	}
	
	long sum=0,k=0;
	
	for(i=0;i<3*n;i=i++)
	{
		 k=0;
		 
		while(k<3)
		{
		b.add(a.get(i));
		i++;
		k++;
		}
	
		Collections.sort(b);
		sum+=b.get(1);
		b.clear();
	}
	
	System.out.println(sum);
	}

}
