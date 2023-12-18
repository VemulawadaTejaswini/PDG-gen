import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    long A = sc.nextInt();

    long score=0;
    long thre=0;
    for (int i=1; i<A; i++){
      if (i>thre && thre!=0)break;
      if(A%i==0){

        long B = i;
        long C = A/i;
        long sc = (B-1+C-1);
        if(score==0){score = sc;thre=Math.max(B,C);}
        else if (score>sc){
          score =  sc;
        }

      }
    }
    System.out.println(score);
  }
}
