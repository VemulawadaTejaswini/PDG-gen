import java.util.*;

class Main {
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  String s = sc.next();
  int c1Count = 0;
  int c2Count = 0;
  int c1 = 0;
  int c2 = 1;
  for (int i=0;i<s.length();i++){
    int x1 = Character.getNumericValue(s.charAt(i));
    if (x1 == c1){
      c2Count ++;
    }else
    {
      c1Count ++;
    }
    c1 = (c1 +1) % 2;
    c2 = (c2 +1) % 2;
  }
  System.out.println(Math.min(c1Count,c2Count));
  }
}