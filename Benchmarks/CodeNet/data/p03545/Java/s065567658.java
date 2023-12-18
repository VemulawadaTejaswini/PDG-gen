import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] S = sc.next().split("");
    for (int i = 0; i < Math.pow(2,S.length-1); i++) {
      int total = Integer.parseInt(S[0]);
      StringBuilder answer = new StringBuilder(S[0]);
      for (int j = 0; j < S.length-1; j++) {
        if((1 & i>>j) == 1) {
          total += Integer.parseInt(S[j+1]);
          answer.append("+").append(S[j+1]);
        } else {
          total -= Integer.parseInt(S[j+1]);
          answer.append("-").append(S[j+1]);
        }
      }
      if (total == 7) {
        System.out.println(answer.append("=7").toString());
        break;
      }
  	}
  }
}