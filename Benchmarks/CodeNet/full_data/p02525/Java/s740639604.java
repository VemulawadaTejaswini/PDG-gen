import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		while((n=scan.nextInt())!=0){
			int[] s = new int[n];
			double ave=0;
			double a2=0;
			for(int i=0;i<n;i++){
				s[i]=scan.nextInt();
				ave+=s[i];
			}
			ave/=n;
			for(int i=0;i<n;i++){
				a2+=Math.pow(s[i]-ave,2);
			}
			System.out.println(Math.sqrt(a2/n));
		}
	}
}