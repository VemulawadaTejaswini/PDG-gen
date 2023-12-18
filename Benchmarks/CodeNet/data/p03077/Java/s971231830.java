import java.util.*;
public class Main{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextLong();
		int b[]=new int[5];
         for(int i=0;i<5;i++)
          b[i]=sc.nextInt();
	  long c=0;
           Arrays.sort(b);
            if(a%b[0]>b[0])
            c=5+(a/b[0])+1;
            else
			c=5+(a/b[0]);
		System.out.println(c);
	}
}