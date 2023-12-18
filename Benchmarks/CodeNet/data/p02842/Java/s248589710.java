import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);

   int N = sc.nextInt();

   boolean ss = true;
   boolean aa = true;
   int count = N*10/11;
   while(ss)
   {
    if(count*108/100 == N) 
    {
      System.out.println(count);
      ss = false;
      aa = false;
      break;
    }
     count++;
     if(count == N) ss = false;
   }
   if(aa) System.out.println(":(");
 
   
 }
}