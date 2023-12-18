import java.util.*;

public class Main {

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    long A = sc.nextLong();

    long score=0;
    long thre=0;
    long B=0;
    long C=0;
    for (long i=1; i<A; i++){

      if (i>thre && thre!=0)break;
      if( A%i == 0 ){

        long B_ = i;
        long C_ = A/i;

        if (B_+C_ < B+C || (B==0&&C==0)){
          B = B_;
          C = C_;
        }else {
          continue;
        }

        if(B==-1 || C==-1){
          System.out.println(B+","+C+","+B_+","+C_+","+(B+C));
        }

        long sc = (B-1+C-1);
        if(score==0){score = sc;thre=Math.max(B,C);}
        else if (score>sc){
          score =  sc;
        }

      }

    }

    System.out.println(B+C-2);
  }

}