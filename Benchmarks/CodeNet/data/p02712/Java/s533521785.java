import java.util.*;

class Main{

	public static void main(String[]$){
		var s=new Scanner(System.in);
		long r=0;
		for(int i=s.nextInt();i>0;--i) {
			if(i%3!=0&&i%5!=0)
				r+=i;
		}
		System.out.println(r);
	}
}