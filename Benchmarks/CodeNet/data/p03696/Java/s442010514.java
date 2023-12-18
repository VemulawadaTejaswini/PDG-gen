import java.io.*;
import java.util.*;

class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String str = sc.nextLine();
    String[] chars = str.split("");
    ArrayList<String> lefts = new ArrayList<String>();
    int leftCount = 0;
    int rightCount = 0;
    for(int i = 0; i < n; i++) {
      String curr = chars[i];
      if(curr.equals("(")){
        lefts.add("(");
      }
      else {
        if(lefts.size() > 0) {
          lefts.remove(lefts.size()-1);
        } else {
          rightCount++;
        }
      }
      leftCount = lefts.size();
    }
    String ans = "";
    for(int i = 0; i < rightCount; i++) {
      ans += "(";
    }
    ans += str;
    for(int i = 0; i < leftCount; i++) {
      ans += ")";
    }
    System.out.println(ans);
  }
}
