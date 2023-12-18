import java.util.Scanner;


public class Main
{

	public static void main(String[] args)
	{
		// TODO Auto-ge
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long x=sc.nextLong(),y=sc.nextLong(),z=sc.nextLong();
			if(y>z||x==1)System.out.println(0);
			else if(y==z)System.out.println(1);
			else System.out.println((x-2)*(z-y)+1);
		}
	}

}
