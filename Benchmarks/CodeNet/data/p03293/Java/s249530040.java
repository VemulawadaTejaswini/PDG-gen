import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    int cnt = 0;
    int L = S.length();
    for (int i = 0; i < L; i++){
      for (int j = 0; j < L; j++){
        if (T.charAt(j) == S.charAt(i)){
          cnt++;
        }
      }
    }
    if (cnt == L){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }