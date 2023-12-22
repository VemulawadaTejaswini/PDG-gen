import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    int maxcnt = 1000;
    for(int i=0; i<=S.length()-T.length(); i++){
      int cnt = 0;
      for(int j=0; j<T.length(); j++){
        if(T.charAt(j) != S.charAt(i+j)){
          cnt++;
        }
      }
        if(cnt<=maxcnt) {
          maxcnt=cnt;
        }
    }
    System.out.println(maxcnt);
  }
}