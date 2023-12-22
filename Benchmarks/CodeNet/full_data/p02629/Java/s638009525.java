import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		String ans="";
		char c[]=new char[12];
		int q=0;
		
		while(n>0) {
			n--;
			c[q++]=(char)(n%26+'a');
			n/=26;
		}
		
		for(int i=q-1;i>=0;i--) {
			System.out.print(c[i]);
		}
		System.out.println();
	}
	
	

}