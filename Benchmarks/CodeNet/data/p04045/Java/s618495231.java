import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    ArrayList<Integer> dislike = new ArrayList<Integer>();
    for(int i = 0; i < K; i++) {
      dislike.add(sc.nextInt());
    }
    ArrayList<Integer> like = new ArrayList<Integer>();
    for(int i = 0; i < 10; i++) {
      if(!(dislike.contains(i))) like.add(i);
    }
    ArrayList<Integer> digit = new ArrayList<Integer>();
    int digitNum = 0;
    for(int i = 1; i <= 4; i++) {
      if(N < (int)Math.pow(10, i)) {
        digitNum = i;
        break;
      }
    }
    for(int i = 0; i < digitNum; i++) {
      int a = N / (int)Math.pow(10, digitNum - i - 1);
      digit.get(a % 10);
    }
    int firstIndex = 4;
    for(int i = 0; i < digit.size(); i++) {
      if(digit.get(i) > like.get(like.size() - 1)) {
        firstIndex = i;
        break;
      }
    }
    String ans = "";
    if(firstIndex == 4) {
      for(int i = 0; i < digit.size(); i++) {
        for(int j = 0; j < like.size(); j++) {
          if(digit.get(i) <= like.get(j)) {
            ans += String.valueOf(like.get(j));
            break;
          }
        }
      }
    } else {
      int min = like.get(0);
      int nonzero = min;
      if(min == 0) nonzero = like.get(1);
      boolean flg = false;
      int victory = 0;
      for(int i = 0; i < firstIndex; i++) {
        if(digit.get(i) < like.get(like.size() - 1)) {
          victory = i;
          flg = true;
          break;
        }
      }
      if(flg) {
        for(int i = 0; i < victory; i++) {
          for(int j = 0; j < like.size(); j++) {
            if(digit.get(i) <= like.get(j)) {
              ans += String.valueOf(like.get(j));
              break;
            }
          }
        }
        for(int j = 0; j < like.size(); j++) {
          if(digit.get(victory) < like.get(j)) {
            ans += String.valueOf(like.get(j));
            break;
          }
        }
        for(int i = victory + 1; i < digit.size(); i++) {
          ans += String.valueOf(min);
        }
      } else {
        ans += String.valueOf(nonzero);
        for(int i = 0; i < digit.size(); i++) {
          ans += String.valueOf(min);
        }
      }
    }
    System.out.println(Integer.parseInt(ans));
  }
}