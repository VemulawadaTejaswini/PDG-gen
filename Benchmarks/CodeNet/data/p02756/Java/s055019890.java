import java.util.*;

//update 2020/1/1 23:01

public class Main{

  static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    String S = next();
    int Q = nextInt();

    int lng = S.length() + Q;

    StringBuilder sb = new StringBuilder(lng);

    int T,F;
    String C;

    sb.append(S);

    for(int i=0;i<Q;i++){
      T = nextInt();
      if(T==1){
        sb.reverse();
      }
      else{
        F = nextInt();
        C = next();
        if(F==1){
          sb.insert(0,C);
        }
        else{
          sb.append(C);
        }
      }
    }


    System.out.println(sb.toString());

  }





  static String next(){
    return sc.next();
  }

  static int nextInt(){
    return Integer.parseInt(sc.next());
  }

}
