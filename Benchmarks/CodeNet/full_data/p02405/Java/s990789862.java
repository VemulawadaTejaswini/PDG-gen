import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
	   Scanner X = new Scanner(System.in);
	   int w = X.nextInt();
	   int h = X.nextInt();
	   if(w==1&&h==1) {
		   System.out.print("#");
		   System.exit(0);
	   }
	   if(w==0&&h==0) {
		   System.exit(0);
	   }
	   for(int i = 0;i<w;i++) {
		   if(i%2!=0) {
			   System.out.print(".");
		   }else {
			   System.out.print("#");
		   }
		   for(int j =0;j<h-1;j++) {
			   if(i%2!=0) {
				   if(j%2!=0) {
					   System.out.print(".");
				   }
				   else {
					   System.out.print("#");
				   }
			   }else {
				   if(j%2==0) {
					   System.out.print(".");
				   }else {
					   System.out.print("#");
				   }
			   }
			   }
		   System.out.println();
		   }
	   X.close();
   }
}
