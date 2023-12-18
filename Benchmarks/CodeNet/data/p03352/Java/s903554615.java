import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
 
   Integer[] beki = new Integer[32];
   for(int i=1;i<=31;i++) beki[i-1]=i*i;
   
   for(int i=N;true;i--)
   {
     if(Arrays.asList(beki).contains(i))
     {
       System.out.println(i);
       break;
     }
   }
 }
}