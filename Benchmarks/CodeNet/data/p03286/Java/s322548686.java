import java.util.*;
 
class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		StringBuilder r=new StringBuilder();
		if(n==0)
			r.append(0);
		while(n!=0){
			int b=Math.abs(n%2);
			r.append(b);
			n=(n-b)/-2;
		}
		System.out.println(r.reverse());
	}
}