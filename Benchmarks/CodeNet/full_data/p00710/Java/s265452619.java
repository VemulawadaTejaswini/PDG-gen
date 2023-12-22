import java.util.Scanner;
public class Main {
   public static void main (String[] agrs) {
	   Scanner input = new Scanner(System.in);
	   while(true) {
		   int n = input.nextInt();
		   int count =n;
		   int N [] = new int [n];
		   for(int i =0;i<n;i++) {
			   N[i]=count;
			   count--;
		   }
		   StringBuffer str = new StringBuffer();
		   for(int i =0;i<n;i++) {
			  str.append(N[i]);
		   }
		   String STR = str.toString();
		   int r = input.nextInt();
		   if(n==0||r==0) {
			   System.exit(0);
		   }
		   for(int i =0;i<r;i++) {
		   int p = input.nextInt();
		   int c = input.nextInt();
		   if(p + c > n +1) {
			   System.exit(0);
		   }
			 String P = str.substring(0,p-1);
		     String C = str.substring(p-1,c+p-1);
		   String END = str.substring(c);
		   STR= C + P + END;
		   }
		   input.nextLine();
		   System.out.println(str.charAt(0));
	   }
     }
}

