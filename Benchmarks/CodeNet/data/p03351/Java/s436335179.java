import java.util.*;

public class Main{
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int ab_distance = Math.abs(a-b);
    int bc_distance = Math.abs(b-c);
    int ac_distance = Math.abs(a-c);
    if(ac_distance <= d){
    	System.out.println("YES");
    }else if(bc_distance<= d && ab_distance <= d){
    	System.out.println("YES");
    }else{
    	System.out.println("NO");
    }
  }
}