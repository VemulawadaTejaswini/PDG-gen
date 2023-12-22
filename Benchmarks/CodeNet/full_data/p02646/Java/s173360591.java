import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ap = sc.nextInt();
    int as = sc.nextInt();
    int bp = sc.nextInt();
    int bs = sc.nextInt();
    int time = sc.nextInt();
    int dis = bp - ap;
    int speed = as - bs;
    long tp = (long)speed * time;
    if(tp >= (long)dis){
    	System.out.println("YES");
    }else{
    	System.out.println("NO");
    }
    
  }
}