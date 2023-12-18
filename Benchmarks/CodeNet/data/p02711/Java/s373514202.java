import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = n/100;
    int y = (n-x*100)/10;
    int z = n-((x*100)+(y*10));
    // System.out.println(x);
    // System.out.println(y);
    // System.out.println(z);
    if(x==7){
      System.out.println("Yes");
    }else if(y/10==7){
      System.out.println("Yes");
    }else if(z==7){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}
