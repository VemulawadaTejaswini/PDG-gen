import java.util.Scanner;

public class Main{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		long a=sc.nextLong();
		long b=sc.nextLong();
		long c=sc.nextLong();
		long d=sc.nextLong();


		long ac=a/c;
		if(a%c==0){
			ac--;
		}
		long bc=b/c;
		long ad=a/d;
		if(a%d==0){
			ad--;
		}
		long bd=b/d;
		long max=1;

		for(long i=c;i>0;i--){
			if(c%i==0 && d%i==0){
				max=i;
				break;
			}
		}
		long min=c*d/max;
		long acd=a/min;
		if(a%min==0){
			acd--;
		}

		long bcd=b/min;

		System.out.println(b-a+1-bc+ac-bd+ad+bcd-acd);


	}
}
