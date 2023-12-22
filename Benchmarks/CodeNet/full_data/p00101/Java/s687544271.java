import java.util.*;
public class Main {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int i = sc.nextInt();
       sc.nextLine();
       for(int j=0;j<i;j++)
	   {
	       String s = sc.nextLine();
	       System.out.println(s.replaceAll("Hoshino","Hoshina"));
	   }
   }
}