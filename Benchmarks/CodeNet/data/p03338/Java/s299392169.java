import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str = sc.next();
    int count = 0;
    int max = 0;
    boolean xmap[] = new boolean[26];
    boolean ymap[] = new boolean[26];
    
    for (int i=1; i<n; i++) {
      count = 0;
      for (int j=0; j<i; j++) {
        put(str.charAt(j), xmap);
      }
      for (int j=i;j<n;j++) {
        put(str.charAt(j), ymap);
      }
      for (int k=0; k<26; k++) {
        if (xmap[k] && ymap[k]) {
          count++;
        }
        // reset
        xmap[k] = false;
        ymap[k] = false;
      }
      if (count > max) {
        max = count;
      }
      
    }
    System.out.println(max);
  }
  private static void put(char x, boolean map[]) {
    if (x == 'a') {
      map[0] = true;
    } else if (x == 'b') {
      map[1] = true;
    } else if (x == 'c') {
      map[2] = true;
    } else if (x == 'd') {
      map[3] = true;
    } else if (x == 'e') {
      map[4] = true;
    } else if (x == 'f') {
      map[5] = true;
    } else if (x == 'g') {
      map[6] = true;
    } else if (x == 'h') {
      map[7] = true;
    } else if (x == 'i') {
      map[8] = true;
    } else if (x == 'j') {
      map[9] = true;
    } else if (x == 'k') {
      map[10] = true;
    } else if (x == 'l') {
      map[11] = true;
    } else if (x == 'm') {
      map[12] = true;
    } else if (x == 'n') {
      map[13] = true;
    } else if (x == 'o') {
      map[14] = true;
    } else if (x == 'p') {
      map[15] = true;
    } else if (x == 'q') {
      map[16] = true;
    } else if (x == 'r') {
      map[17] = true;
    } else if (x == 's') {
      map[18] = true;
    } else if (x == 't') {
      map[19] = true;
    } else if (x == 'u') {
      map[20] = true;
    } else if (x == 'v') {
      map[21] = true;
    } else if (x == 'w') {
      map[22] = true;
    } else if (x == 'x') {
      map[23] = true;
    } else if (x == 'y') {
      map[24] = true;
    } else if (x == 'z') {
      map[25] = true;
    }
  }
}
