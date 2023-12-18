import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		int dai=Math.max(C,D);
		int shou=Math.min(C,D);
		int amari=dai%shou;
		while(amari!=0){
			dai=shou;
			shou=amari;
			amari=dai%shou;
		}
      System.out.println( B-A -(((B-A+1)/C)+((B-A+1)/D)-((B-A+1)/(C*D/shou))));
	}
}
