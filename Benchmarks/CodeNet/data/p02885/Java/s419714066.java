import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int a =scn.nextInt();
		int b =scn.nextInt();
		int ans=a-2*b;
		if(ans<0) {
			ans=0;
		}
		System.out.println(ans);
    }
}