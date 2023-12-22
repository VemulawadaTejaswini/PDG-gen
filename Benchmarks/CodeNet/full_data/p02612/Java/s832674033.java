import java.util.*;
public class Main {
	public static void main(String[] args) { 
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int ans=n%1000;
		if(ans!=0) {
			ans=1000-ans;
		}
		System.out.println(ans);
    }
}