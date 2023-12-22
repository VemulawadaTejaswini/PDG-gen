import java.util.Scanner;

class Main{
  public static boolean[] lineSet(){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    boolean[] line = new boolean[8];
    for (int i = 0; i < 8; i++) {
      if (str.charAt(i) == '0') {
        line[i] = false;
        System.out.println(line[i]);
      }
      else {
        line[i] = true;
        System.out.println(line[i]);
      }
    }
    return line;
  }

  public static int[] check(boolean[] line){
    for (int i = 0; i < 8; i++) {
      if (line[i]) {
        if (i < 7 && line[i+1]) {
          if (i < 6 && line[i+2]) {
            int[] check = {i,3};
            return check;
          }
          else {
            int[] check = {i,2};
            return check;
          }
        }
        else {
            int[] check = {i,1};
            return check;
        }
      }
    }
    int[] check = {0,0};
    return check;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
      int[] chk1 = check(lineSet());
      if(chk1[1] == 0) {
        continue;
      }
      else if (chk1[1] == 3) {
        System.out.println("C");
        continue;
      }
      else {
        int[] chk2 = check(lineSet());
        if (chk1[1] == 1) {
          if (chk2[1] == 1) {
            System.out.println("B");
            continue;
          }
          else if (chk1[0] == chk2[0]) {
            System.out.println("F");
            continue;
          }
          else {
            System.out.println("D");
            continue;
          }
        }
        else {
          if (chk1[0] == chk2[0]) {
            System.out.println("A");
            continue;
          }
          else if (chk1[0] < chk2[0]) {
            System.out.println("E");
            continue;
          }
          else {
            System.out.println("G");
            continue;
          }
        }
      }
    }
  }
}