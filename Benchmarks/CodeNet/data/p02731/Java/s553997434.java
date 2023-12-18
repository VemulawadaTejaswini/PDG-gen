import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int L = sc.nextInt();
    double a = 0;
    double b = 0;
    double sum =0;
    double max = 0;
    
    for (a=0; a < 1000 ; a = a + 0.01) {
      for (b=0; b < 1000 -a  ; b = b + 0.01) {
        sum = a*b*(L - a - b);
        if(sum >= max){
          max =sum;
        }
      }
    }
    System.out.println(max);   
    return;
  }

}

