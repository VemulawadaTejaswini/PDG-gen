import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   long N = sc.nextInt();
   long[] Xi = new int[N];
   for(int i =0;i<5;i++)
   {
     Xi[i] = sc.nextInt();
   }
	Arrays.sort(Xi);
   long ans = (N/Xi[0]) + 4;
   System.out.println(ans);
 }
}