import java.util.Scanner;

public class Solution {
   public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   String st1 = sc.nextLine();
	   String st2 = sc.nextLine();
	   if(st1.charAt(0)==st2.charAt(2) && st1.charAt(1)==st2.charAt(1) && st1.charAt(2)==st2.charAt(0)) {
		   System.out.println("YES");
	   }
	   else {
		   System.out.println("NO");
	   }
   }
}