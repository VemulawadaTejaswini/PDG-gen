
import java.math.BigInteger;
import java.util.*;
public class Main {





public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
		String odd=sc.next();
		String even=sc.next();
		String ans="";
		int j=0;
		int k=0;
		for(int i=1;i<=odd.length()+even.length();i++) {
			if(i%2!=0) {
				ans+=odd.charAt(j);
				j++;
			}else {
				ans+=even.charAt(k);
				k++;
			}
		}
		System.out.println(ans);
}
}

class pair{
	int x,y;
	pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}
