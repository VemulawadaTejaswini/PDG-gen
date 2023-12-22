import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Obj> listA = new ArrayList<>();
    ArrayList<Obj> listB = new ArrayList<>();
    for(int i = 0; i < n; i++){
      String s = sc.next();
      int left = 0;
      int right = 0;
      for(int j = 0; j < s.length(); j++){
        if(s.charAt(j) == '('){
          left++;
        } else if(s.charAt(j) == ')'){
          if(left > 0){
            left--;
          } else {
            right++;
          }
        }
      }
      Obj obj = new Obj(left,right);
      if(obj.left > obj.right){
        listA.add(obj);
      } else {
        listB.add(obj);
      }
    }
    if(solve(listA, listB)){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
  static boolean solve(ArrayList<Obj> listA, ArrayList<Obj> listB){
    listA.sort((o1, o2) -> o1.right - o2.right);
    listB.sort((o1, o2) -> o2.left - o1.left);
    int temp = 0;
    for(Obj a : listA){
      temp -= a.right;
      if(temp < 0) return false;
      temp += a.left;
    }
    for(Obj a : listB){
      temp -= a.right;
      if(temp < 0) return false;
      temp += a.left;
    }
    if(temp != 0) return false;
    return true;
  }

  static class Obj {
    int left;
    int right;
    public Obj(int left, int right){
      this.left = left;
      this.right = right;
    }
  }
}