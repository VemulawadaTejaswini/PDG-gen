import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int ab_distance = a - b;
    int bc_distance = b - c;
    int ac_distance = a - c;
    if(Math.abs(ac_distance) <= d){
    	System.out.println("YES");
    }else if(Math.abs(ab_distance) <= d && Math.abs(bc_distance) <= d){
    	System.out.println("YES");
    }else{
    	System.out.println("NO");
    }
  }
}
