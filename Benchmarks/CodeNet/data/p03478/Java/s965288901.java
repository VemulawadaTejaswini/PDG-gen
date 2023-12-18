import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int[] c = {0,0,0,0};

    int sum = 0 ;

    for(int i = 1 ; i <= N ; i ++){
      c[4] =          i  / 10000 ;
      c[3] = (i % 10000) / 1000  ;
      c[2] = (i % 1000)  / 100   ;
      c[1] = (i % 100)   / 10    ;
      c[0] =  i % 10             ;

      int digitSum = c[0] + c[1] + c[2] +  c[3] + c[4] ;

      if( digitSum  >= A && digitSum <= B ){
        sum = sum + i ;
      }
    }
    System.out.println(sum);
  }
}
