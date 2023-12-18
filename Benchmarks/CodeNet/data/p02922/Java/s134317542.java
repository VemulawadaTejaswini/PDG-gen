import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int B = sc.nextInt();
   int count = 1;
   if(N>=B){
   }else{
   int x = B-N;
     for(int i=0;x>0;i++){
       x = x-(N-1);
         count++;
     }

   }
System.out.println(count);   
   
 }
}