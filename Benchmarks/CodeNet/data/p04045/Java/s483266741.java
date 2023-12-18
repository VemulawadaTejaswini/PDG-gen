import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    List<String> list = new ArrayList<String>();
    for (int i = 0 ; i < k ; i++){
      list.add(Integer.toString(sc.nextInt()));
    }
    for (int i = n ; i < 100000 ; i++){
      String target = Integer.toString(i);
      if (judge(target, list)) {
        System.out.println(i);
        break;
      }
    }
    sc.close();
 }
 static boolean judge(String target ,List<String>l) {
   boolean b = true;
   for (String s : l){
     if (target.contains(s)) {
      b = false;
     }
    }
   return b;
 }
}