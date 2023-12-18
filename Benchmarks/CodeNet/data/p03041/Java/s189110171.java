import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     String s = sc.next();
     sc.close();
     char ss = s.charAt(k-1);
     String sss = String.valueOf(ss);
     String lo = sss.toLowerCase();
     StringBuilder sb = new StringBuilder();
     sb.append(s);
     sb.replace(k-1, k, lo);
     String ans = sb.toString();
     System.out.println(ans);
     
	}

}