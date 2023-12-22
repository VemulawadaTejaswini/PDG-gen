import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int c1 = sc.nextInt();
      int c2 = sc.nextInt();
      int c3 = sc.nextInt();
      boolean[] used = new boolean[11];
      used[c1] = true;
      used[c2] = true;
      used[c3] = true;
      int counter = 0;
      for (int i = 0; i < 11; i++) {
        if (!used[i] && c1+c2+i < 20) {
          counter++;
        }
      }
      if(counter > 3) {
        System.out.println("YES");
      }
      else {
        System.out.println("NO");
      }
    }
  }
}