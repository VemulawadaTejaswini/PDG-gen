

import java.util.Scanner;
public class Main{
	public static void main(String[] args) {


    Scanner sc =new Scanner(System.in);
    String s=sc.next();
    String t=sc.next();
    String u=sc.next();
    String S=s.substring(0,1);
    String T=t.substring(1,2);
    String U=u.substring(2,3);
    System.out.println(S+T+U);

	}
}