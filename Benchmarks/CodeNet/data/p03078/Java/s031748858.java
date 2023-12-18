import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    int Z = sc.nextInt();
    int K = sc.nextInt();
    long[] Ai = new long[X];
    long[] Bi = new long[Y];
    long[] Ci = new long[Z];
    for (int i = 0; i < X; i++)
      Ai[i] = sc.nextLong();
    for (int i = 0; i < Y; i++)
      Bi[i] = sc.nextLong();
    for (int i = 0; i < Z; i++)
      Ci[i] = sc.nextLong();

    long[] dels = new long[K];
    long[] alls = new long[X*Y*Z];

    for (int i = 0; i < Z; i++) {
      for (int j = 0; j < Y; j++) {
        for (int k = 0; k < X; k++) {
          alls[i*Y*X + j*X + k] = Ai[k] + Bi[j] + Ci[i];
        }
      }
    }

    int index;
    long maxnum;
    for (int i = 0; i < K; i++) {
      index = 0;
      maxnum = 0;
      for (int j = 0; j < X*Y*Z; j++) {
        if (alls[j] > maxnum) {
          index = j;
          maxnum = alls[j];
        }
      }
      dels[i] = alls[index];
      alls[index] = 0;
    }


    for (int i = 0; i < K; i++) {
      System.out.println(dels[i]);
    }
  }
}
