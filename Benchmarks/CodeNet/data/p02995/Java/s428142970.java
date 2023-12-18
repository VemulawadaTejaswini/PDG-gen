import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long A=sc.nextLong();
		long B=sc.nextLong();
		long C=sc.nextLong();
		long D=sc.nextLong();
      	long chai=B-A;
		System.out.println(chai-((chai/C)+(chai/D)-(chai/(C*D/uqrid(C,D)))));
	}
	static long uqrid(long C,long D){
		long dai=Math.max(C,D);
		long shou=Math.min(C,D);
		long amari=dai%shou;
 	     	while(amari!=0){
				dai=shou;
				shou=amari;
				amari=dai%shou;
			}
        
		return shou;
    }
}
