import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long x = n/11;
		long y = n%11;
		if(n<=6){
			System.out.print(1);
		}else if(n<=11)
			System.out.print(2);
		else{
			x*=2;
			if(y<7){
				if(y%5==2||y%5==0){
					x+=2;
				}else
					x+=1;
			}
			else{
				if(y%5==2||y%5==0)
					x+=3;
				else 
					x+=2;
			}
			System.out.print(x);
		}
	}
}