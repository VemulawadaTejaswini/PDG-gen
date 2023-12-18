import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] A = new int[N];
 	for(int i = 0 ; i < N ; i++)
      {
    A[i] = sc.nextInt();
      }
   long max = 0;
   for(int i = 0 ; i < N ; i++)
      {
    max += A[i];
      }
   long half =0;
   int count =0;
   while(max - half > half)
   {
      half+=A[count]; 
      count++;
   }
   if (Math.abs(max - 2* half) >= Math.abs(max - 2*half + 2*A[count-1]))
   {
     System.out.println(Math.abs(max - 2*half + 2*A[count-1]));
   }
   else System.out.println(Math.abs(max - 2* half));
 }
}