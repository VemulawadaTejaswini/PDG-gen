import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long L=stdIn.nextLong();
		long R=stdIn.nextLong();
		long min=2019,min2=2019,z=L,y=0;
		while(z<=R){
			if(z==L)
				y=z%2019;
			if(z!=L&&z%2019==y)
				break;
			if(z%2019<min)
				min=z%2019;
			z++;
		}z=L;
		while(z<=R){
			if(z==L)
				y=z%2019;
			if(z!=L&&z%2019==y)
				break;
			long b=z%2019*min;
			if(b%2019<min2&&z%2019!=min)
				min2=b%2019;
			z++;
		}
		System.out.println(min2);
	}
}