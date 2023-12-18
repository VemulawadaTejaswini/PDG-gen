import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    int St = Integer.parseInt(S.substring(0,2));
    int Sb = Integer.parseInt(S.substring(3,4));
    String ans = "";
    if (month(St) && month(Sb)){
      ans = "AMBIGUOUS";
    } else if (!month(St) && !month(Sb)) {
      ans = "NA";
    } else if (!month(St) && month(Sb)) {
      ans = "YYMM";
    } else if (!month(St) && month(Sb)) {
      ans = "MMYY";
    }
    System.out.println(ans);
  }
  static boolean month(int t){
    if ((t>0)&&(t<=12)){
      return true;
    } else {
      return false;
    }
  }
}