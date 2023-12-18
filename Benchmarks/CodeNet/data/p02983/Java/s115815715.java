import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		long L=stdIn.nextLong();
		long R=stdIn.nextLong();
		long min=2019,min2=2019,z=L,y=L-1;
		while(z<=R+1){
			if(z!=R+1&&z%2019<min)
				min=z%2019;
			if(z!=L&&y%2019<min2&&y%2019!=min)
				min2=y%2019;
			y++;
			z++;
		}
		System.out.println((min*min2)%2019);
	}
}