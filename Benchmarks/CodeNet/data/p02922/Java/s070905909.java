import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    for(int i=1;i<=b;i++) {
      if ( a == b) {
        System.out.println(1);
        break;
      } else if(a*i > b) {
        System.out.println(i);
        break;
      }
    }
    
    
}
}
