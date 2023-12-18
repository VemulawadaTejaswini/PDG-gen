import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   double[] Si = new double[N];
   for(int i = 0; i<N;i++)
   {
		Si[i] = sc.nextDouble();       
   }
   double sum_re = 0.0;
   for(int i = 0; i<N;i++)
   {
		sum_re += 1/Si[i];
   }
   System.out.println(1/sum_re);
 }
}