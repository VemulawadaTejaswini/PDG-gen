import java.util.*;
class Main{
    public static void main(String a[]){
      Scanner s=new Scanner(System.in);
      int n = s.nextInt();
      int m = s.nextInt();
      System.out.print(m==1&&n==1?1:m==2||n==2?0:(long)(n==1?1:n-2)*(m==1?1:m-2));
  }
}
