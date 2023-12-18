import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    Stack<Integer> st = new Stack<>();


    int ans = 0;

    int cntG = 0;
    int cntS = 0;
    char prev='<';
    for (int i = 0; i < S.length() ; i++) {
      char c = S.charAt(i);

      if(c=='<'){
        if(prev == '<'){  //<<
          cntG++;
        }else{//    ><
          cntS++;
          ans +=calc(cntG,cntS);
          cntG=1;
          cntS=0;
        }
      }else{// >
        if(prev == '>'){
          cntS++;
        }else{//  <>
          //nothing
        }
      }
      prev = c;
    }

    if(prev=='<'){
//      cntG++;
    }else{
      cntS++;
    }

    if(cntG!=0 || cntS!=0){
      ans += calc(cntG,cntS);
    }

    System.out.println(ans);

  }
  static int calc(int cntG,int cntS){
      return Math.max(cntG,cntS) + cntG*(cntG-1)/2 +cntS*(cntS-1)/2;
  }

}