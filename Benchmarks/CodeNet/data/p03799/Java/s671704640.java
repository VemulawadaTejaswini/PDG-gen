import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long a=sc.nextInt(),b=sc.nextInt();
		long sum = 0;
		if(a>=b/2){
			sum+=b/2;
		}else{
			sum+=a;
			b-=a*2;
			if(b>=4)
				sum+=b/4;
		}
		System.out.print(sum);
	}
}