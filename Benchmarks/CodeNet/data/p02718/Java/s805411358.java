import java.util.Scanner;

public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int A = sc.nextInt();
   int B = sc.nextInt();
   int hairetu[] = new int[A];
   int sum =0;
   int count = 0;
   for(int i=0; i<A; i++) {
   hairetu[i] = sc.nextInt();
   sum += hairetu[i];
   }

   int joken = sum/(4*A);
   for(int i=0; i<A; i++) {
	   if(hairetu[i] > joken) {
		   count++;
	   }
   }

   if(count >= B) {
	   System.out.print("Yes");
   } else {
	   System.out.print("No");
   }

 }
}


