import java.util.Arrays;
import java.util.Scanner;


public class Main 
{

public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	int n,i,j;
	long sum=0;
	
	
	n=sc.nextInt();
	String[] s=new String[n];
	String[] ss = new String[n];
	
	for(i=0;i<n;i++)
	{	
		s[i]=sc.next();
		char[] c = s[i].toCharArray();
		Arrays.sort(c);
		ss[i] = new String(c);
	}
	  Arrays.sort(ss);
	
	for(i=0;i<n-1;i++)
		for(j=i+1;j<n;j++)
		if(ss[i].equals(ss[j]))
			sum++;
	
	System.out.println(sum);
	}
}
