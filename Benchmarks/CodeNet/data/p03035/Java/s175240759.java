import java.util.*;

public class test {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    if(A >= 13){
      System.out.println(B);
    }else if(12 >= A && A>= 6)
    {
      System.out.println(B/2);
    }
    else if(5 >= A && A >=0)
      System.out.println(0);
  }
}

