import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] ai = new int[N];

   for (int i = 0;i<N;i++) ai[i] = sc.nextInt();
   int ans = 0;
   
   int brick = 1; 
   for(int i = 0;i<N;i++)
   {
     if(ai[i]==brick)
     {
       ans++;
       brick++;
     }
   } 
   System.out.println(ans);
 }
}