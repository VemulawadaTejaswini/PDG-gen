import java.util.*;
public class Main {
   public static void main(String[] args){
	   Scanner buf = new Scanner(System.in);
	   int cnt = 1;
	   boolean judge = true;
	   while(judge){
		   int i;
		   i = buf.nextInt();
		   if(i == 0) break;
		   System.out.println("Case "+cnt+": " +i);
		   cnt++;
	   }
   }
}