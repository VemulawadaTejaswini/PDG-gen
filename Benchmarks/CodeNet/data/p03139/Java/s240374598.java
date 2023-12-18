import java.util.*;

public class Main {

  public static void main(String[] args) {
  
  Scanner saw = new Scanner(System.in);
  int N,A,B,max,min;
  N = saw.nextInt();
  A = saw.nextInt();
  B = saw.nextInt();
  if((A+B)<=N){
    min = 0;
  }else{
    min = A+B-N;
  }
  if(A>=B){
    max = B;
  }else{
    max = A;
  }
  System.out.println(max+" "+min);
   
  }
}
