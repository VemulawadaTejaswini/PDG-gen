import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Ai = new int[N];
 	for(int i = 0 ; i < N ; i++)
      {
    Ai[i] = sc.nextInt();
      }
   int max = 0;
   for(int i = 0 ; i < N ; i++)
      {
    max += Ai[i];
      }
   int half =0;
   int count =0;
   while(half <= max/2)
   {
      half+=Ai[count]; 
      count++;
   }
   if(half - max/2 >= max/2 -half +Ai[count-1] )
     System.out.println(max/2 -half +Ai[count-1]);
   else System.out.println(max/2 -half +Ai[count-1] );
 
   
 }
}