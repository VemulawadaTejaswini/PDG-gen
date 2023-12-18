import java.util.*;
public class Main{
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int[] N = new int[3];
   	N[0] = sc.nextInt();
   	N[1] = sc.nextInt();
   	N[2] = sc.nextInt();
    
    Arrays.sort(N);
	System.out.println(N[0]+N[1]);
 }
}