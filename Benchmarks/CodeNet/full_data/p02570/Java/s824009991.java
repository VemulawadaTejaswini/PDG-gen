import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long D = sc.nextLong();
		long T = sc.nextLong();
		long S = sc.nextLong();
		if((S*T)>=D){
		    System.out.println("Yes");
		}
		else{
		    System.out.println("No");
		}
	}
}