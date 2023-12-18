import java.util.*;

public class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt(),a=0,i=0;
		while(i++<n)
			if(s.nextInt() == i){
				a++;
				if(i++<n)s.next();
			}
		System.out.println(a);
	}
}