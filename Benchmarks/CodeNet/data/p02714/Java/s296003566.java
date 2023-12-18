import java.util.*;
import java.lang.Math.*;
import java.math.BigInteger;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int c=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				for(int k=0;k<n;k++) {
					if((s.charAt(i)!=s.charAt(j)&&s.charAt(i)!=s.charAt(k)&&s.charAt(j)!=s.charAt(k))&&j-i!=k-j&&(i<j)&&(j<k))c++;
				}
			}
		}
		System.out.println(c);
	}
}