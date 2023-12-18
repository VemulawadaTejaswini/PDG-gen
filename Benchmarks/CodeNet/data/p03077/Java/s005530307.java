import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int[] Xi = new int[N];
   for(int i =0;i<5;i++)
   {
     Xi[i] = sc.nextInt();
   }
	Arrays.sort(Xi);
   int ans = (N/Xi[0]) + 4;
   System.out.println(ans);
 }
}