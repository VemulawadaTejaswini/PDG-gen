import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long a=sc.nextInt();
			long b=sc.nextInt();
			System.out.println(gcd(a,b)+" "+lcm(a,b));
		}
	}
	static long gcd(long a,long b){
		if(a%b==0){
			return b;
		}else{
			return gcd(b,a%b);
		}
	}
	static long lcm(long a,long b){
		return a*b/gcd(a,b);
	}
}