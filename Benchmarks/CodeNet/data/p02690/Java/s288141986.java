import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n= sc.nextLong();
		long temp=0;
		long a=0;
		long b;
		while(true){
			a++;
			b=(long)Math.pow(Math.pow(a,5)-n,0.2);
			temp=(long)(Math.pow(a,5)-Math.pow(b,5));
			if(temp==n){
				break;
			}
          	b++;
			temp=(long)(Math.pow(a,5)-Math.pow(b,5));
			if(temp==n){
				break;
			}
          	b-=2;
			temp=(long)(Math.pow(a,5)-Math.pow(b,5));
			if(temp==n){
				break;
			}
		}
		
		System.out.println(a+" "+b);
	}
}
