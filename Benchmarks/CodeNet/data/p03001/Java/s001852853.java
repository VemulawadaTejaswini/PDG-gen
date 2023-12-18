import java.util.*;

public class Main{

	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		int w=sc.nextInt();
		int h=sc.nextInt();
		int x=sc.nextInt();
		int y=sc.nextInt();

		long total=w*h;
		long s1=total-w*y;
		long s2=w*y;
		long s3=total-h*x;
		long s4=h*x;
		long k1,k2;


		if(s1>s2){
		  k1=s2;
		}else{
		  k1=s1;
		}
		if(s3>s4){
			k2=s4;
		}else{
			k2=s3;
		}
		if(k1>k2){
			System.out.println(k1+" 0");
		}else if(k1<k2){
			System.out.println(k2+" 0");
		}else if(k1==k2){
			System.out.println(k1+" 1");
		}



	}
}
