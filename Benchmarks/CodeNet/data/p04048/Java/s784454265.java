import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			long n=sc.nextLong();
			long x=sc.nextLong();
			if(n%2==1) System.out.println(3*n-3);
			else{
				long ans=3*n-3;
				System.out.println(ans-3*(Math.min(x,n-x)-1));
			}
		}
	}
}