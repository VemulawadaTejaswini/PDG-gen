import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long W = sc.nextLong(); 
    Long H = sc.nextLong(); 
    Long x = sc.nextLong(); 
    Long y = sc.nextLong(); 
    int b = 0;
    if((double)W/2.0==(double)x && (double)H/2.0==(double)y){
      b = 1;
    }
    double ans = (double)(W*H)/2.0;

    System.out.println(ans+" "+b);    
  
  }
}


