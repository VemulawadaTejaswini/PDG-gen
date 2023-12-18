import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    int strong = 0;
    for(int i = 0; i < N; i++) {
      int a = sc.nextInt();
      int c = -1;
      if(a < 400) c = 0;
      if((a >= 400) && (a < 800)) c = 1;
      if((a >= 800) && (a < 1200)) c = 2;
      if((a >= 1200) && (a < 1600)) c = 3;
      if((a >= 1600) && (a < 2000)) c = 4;
      if((a >= 2000) && (a < 2400)) c = 5;
      if((a >= 2400) && (a < 2800)) c = 6;
      if((a >= 2800) && (a < 3200)) c = 7;
      if(c == -1) strong++;
      if(map.containsKey(c)) {
      } else {
        map.put(c, 1);
      }
    }
    int vari = 0;
    for(int key : map.keySet()) {
      vari++;
    }
    int min = 0;
    int max = 0;
    if(vari == 0) {
      min = 1;
      max = Math.min(8, N);
    } else {
      min = vari;
      max = Math.min(8, vari + strong)
    }
    System.out.println(min + " " + max);
  }
}