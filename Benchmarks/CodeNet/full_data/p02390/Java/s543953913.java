import java.util.*;

public class Watch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int h = S/(60*60);
		int m = (S - h*60*60)/60;
		int s = S - h*60*60-m*60;
		System.out.println(h+":"+m+":"+s);
	}
}