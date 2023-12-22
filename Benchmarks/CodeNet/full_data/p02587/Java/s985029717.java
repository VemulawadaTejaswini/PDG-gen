import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s_array = new String[n];
    long[] c_array = new long[n];
    for (int i = 0; i < n; i++) {
      s_array[i] = sc.next();
      c_array[i] = sc.nextLong();
    }
    sc.close();

    long score = Long.MAX_VALUE;
    Queue<Nominee> queue = new ArrayDeque<>();
    for (int i = 0; i < n; i++) {
      Nominee nominee = new Nominee(s_array[i], "", c_array[i]);
      queue.add(nominee);
    }
    while (!queue.isEmpty()) {
      Nominee nominee = queue.poll();
      if(nominee.score >= score){
        continue;
      }
      for (int i = 0; i < n; i++) {
        Nominee next = new Nominee(nominee.left, nominee.right, nominee.score);
        if (!next.addString(s_array[i], c_array[i])) {
          continue;
        }
        if (next.isPalindrome()) {
          score = Math.min(score, next.score);
          continue;
        }
        if(score <= next.score){
          continue;
        }
        queue.add(next);
      }
    }
    System.out.println((score == Long.MAX_VALUE) ? -1 : score);
  }

  static class Nominee {

    String left = "";
    String right = "";
    long score = 0;

    public Nominee(String left, String right, long score) {
      this.left = left;
      this.right = right;
      this.score = score;
    }

    boolean addString(String s, long c) {
      if (left.isEmpty()) {
        left = s;
      } else if (right.isEmpty()) {
        right = s;
      } else {
        throw new IllegalStateException("state is illegal.");
      }
      this.score += c;
      int len = Math.min(left.length(), right.length());
      int idx = 0;
      while(idx < len){
        if(left.charAt(idx) == right.charAt(right.length() - 1 - idx)){
          idx++;
        } else {
          return false;
        }
      }

      left = left.substring(len);
      right = right.substring(0, right.length() - len);
      return true;
    }

    boolean isPalindrome() {
      String str = this.left + this.right;
      if (str.isEmpty()) {
        return true;
      }
      int leftIdx = 0;
      int rightIdx = str.length() - 1;
      while(leftIdx <= rightIdx){
        if(str.charAt(leftIdx) != str.charAt(rightIdx)){
          return false;
        }
        leftIdx++;
        rightIdx--;
      }
      return true;
    }
  }
}
