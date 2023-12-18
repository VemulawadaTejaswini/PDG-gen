import java.util.*;

public class Main {
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	int hp = scn.nextInt();
      int n = scn.nextInt();
      int[] a = new int[n];
      int att = 0;
      for(int i=0; i<a.length; ++i){
        a[i] = scn.nextInt();
      }
      for(int i=0; i<a.length; ++i){
        att = att + a[i];
      }
      if(att >= hp){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
	}
}