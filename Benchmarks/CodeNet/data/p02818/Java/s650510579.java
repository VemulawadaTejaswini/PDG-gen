import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		long a=sc.nextLong();
		long b=sc.nextLong();
		long k=sc.nextLong();
		
		
		long sun=0;
		if(a==0||b==0){
			a=a;
			b=b;
		}
		else if(a<k){
			sun=k-a;
			a=0;
		}
		System.out.println(a+" "+(b-sun));
	}
}