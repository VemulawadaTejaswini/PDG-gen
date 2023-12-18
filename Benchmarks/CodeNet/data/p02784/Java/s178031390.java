import java.util.Scanner;

public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int H = sc.nextInt();
   int N = sc.nextInt();
   int a[] = new int[N];
   int sum = 0;
   for(int i=0; i<N; i++){
	   a[i] = sc.nextInt();
   }

   for(int i=0; i<N; i++) {
	   sum += a[i];
   }

   if(H - sum <= 0) {
	   System.out.print("Yes");
	   }else {
	   System.out.print("No");
	   }
   }
}
