import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int B = sc.nextInt();
   int count = 1;
   int x = B-N;
     while(x>0){
       x = x-(N-1);
         count++;
     }

   if(B==1) count=0;
System.out.println(count);   
   
 }
}