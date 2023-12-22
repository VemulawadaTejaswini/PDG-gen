import java.util.*;

class Main {
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  int a = Integer.parseInt(sc.next());
  sc.close();

  int h = a/3600;
  int m = (a%3600)/60;
  int s = a%60;

  System.out.println(h + ":" + m + ":" + s);
 }
}
