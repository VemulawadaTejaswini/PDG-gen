import java.util.*;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),m=s.nextInt()-1,d=s.nextInt();
		System.out.printf("%.10f\n",
				m*1.0/n*(d==0
				?1
				:(n-d)*2/n));
	}
}
