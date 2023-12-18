import java.util.*;
import java.lang.Math.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int n=sc.nextInt();
		int ans=0;
		for(int i=0;i<n;i++)ans+=sc.nextInt();
		if(ans>d)System.out.println(-1);
		else System.out.println(d-ans);
	}
}