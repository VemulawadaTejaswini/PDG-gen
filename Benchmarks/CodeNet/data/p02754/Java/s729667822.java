import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 int n = scn.nextInt();
		 int a = scn.nextInt();
		 int b = scn.nextInt();
		 
		 int val = a+b;
		  int ans=(n/val);
		   ans = ans*a;
		    int val1 = (n%val);
		      ans+= val1<a?val1:a;
		      System.out.println(ans);

	}

}