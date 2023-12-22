import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long k = sc.nextLong();
		long d = sc.nextLong();

		long div = Math.abs(x)/d;
        
		if(x>0){
			if(k<div){
				System.out.println(x-k*d);
			}
			else{
			x=x-div*d;
			k=k-div;
			if(k%2==0){
				System.out.println(x);
			}
			else{
				System.out.println(Math.abs(x-d));
			}
		}
		}

		else if(x<0){
			if(k<div){
				System.out.println(Math.abs(x+div*d));
			}
			else{
			x=x+div*d;
			k=k-div;
			if(k%2==0){
				System.out.println(Math.abs(x));
			}
			else{
				System.out.println(Math.abs(x+d));
			}
		}
		}

		else if(x==0){
			if(k%2==0){
				System.out.println(x);
			}
			else{
				System.out.println(x+d);
			}
		}
	}
}