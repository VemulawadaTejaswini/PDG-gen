import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int X = sc.nextInt();
   String  ans ="No";
   if(500*N>=X) ans ="Yes";
       
     System.out.println(ans);
 }
}