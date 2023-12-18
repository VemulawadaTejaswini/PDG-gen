import java.util.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    int Max = 2147483647;
    
   if(A < Max || B < Max || K < Max){
     for(int i = 0; i < K; i++){
    if(A > 0){
      A = A -1;
    }else if(B > 0){
      B = B -1;
    }
  }
}else{
  A = 0;
  B = 0;
}

    System.out.println(A + " " + B);
}
}
