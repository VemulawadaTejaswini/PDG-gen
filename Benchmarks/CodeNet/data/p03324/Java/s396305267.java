import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//数値
		int d = Integer.parseInt(sc.next());
		int n = Integer.parseInt(sc.next());
		if(d==0) {
		    System.out.println(n);
		}
		if(d==1) {
			System.out.println(n*100);
		}
		if(d==2) {
		    System.out.println(n*10000);
		}
     }
}