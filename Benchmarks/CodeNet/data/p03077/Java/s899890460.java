import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long N = sc.nextLong();
   long[] Xi = new long[5];
   for(int i =0;i<5;i++)
   {
     Xi[i] = sc.nextLong();
   }
	Arrays.sort(Xi);
   long ans = (N/Xi[0]) + 4;
   System.out.println(ans);
 }
}