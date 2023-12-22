import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int[] pai = new int[10];
      boolean[] agarihai = new boolean[10];
      String str = sc.next();
      for (int i = 0; i < 13; i++) {
        pai[(int)(str.charAt(i)-'0')]++;
      }
      for (int i = 1; i < 10; i++) {
        for (int j = 1; j < 10; j++) {
          int[] temp = new int[10];
          for (int k = 0; k < 10; k++) {
            temp[k] = pai[k];
          }
          temp[i]++;
          if (temp[i] > 4) {
            break;
          }
          else if (temp[j] < 2) {
            continue;
          }
          else {
            int counter = 0;
            temp[j] -= 2;
            for (int k = 1; k < 10; ) {
              if (temp[k] >= 3) {
                temp[k] -= 3;
                counter++;
                continue;
              }
              else if (k < 8 && temp[k] > 0 && temp[k+1] > 0 && temp[k+2] > 0) {
                temp[k]--;
                temp[k+1]--;
                temp[k+2]--;
                counter++;
                continue;
              }
              k++;
            }
            if (counter == 4) {
              agarihai[i] = true;
              break;
            }
          }
        }
      }
      str = "";
      for (int i = 1; i < 10; i++) {
        if (agarihai[i]) {
          str += i + " ";
        }
      }
      System.out.println(str.equals("") ? 0 : str.trim());
    }
  }
}