import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] even = new int[n / 2];
    int[] nod = new int[n / 2];
    for (int i = 0; i < n / 2; i++) {
      even[i] = sc.nextInt();
      nod[i] = sc.nextInt();
    }
    int modeEvenCount_1 = 0;
    int modeEven_1 = -1;
    int modeEvenCount_2 = 0;
    int modeNodCount_1 = 0;
    int modeNod_1 = -1;
    int modeNodCount_2 = 0;
    int lim = n / 2;
    for (int i = 0; i < lim - 1; i++) {
      int count = 0;
      for (int j = i; j < lim; j++) {
        if (even[i] == even[j]) {
          count++;
        }
      }
      if (modeEvenCount_1 < count) {
        modeEvenCount_2 = modeEvenCount_1;
        modeEvenCount_1 = count;
        modeEven_1 = even[i];
      } else if (modeEvenCount_2 < count) {
        modeEvenCount_2 = count;
      }
    }
    for (int i = 0; i < lim - 1; i++) {
      int count = 0;
      for (int j = i; j < lim; j++) {
        if (nod[i] == nod[j]) {
          count++;
        }
      }
      if (modeNodCount_1 < count) {
        modeNodCount_2 = modeNodCount_1;
        modeNodCount_1 = count;
        modeNod_1 = nod[i];
      } else if (modeNodCount_2 < count) {
        modeNodCount_2 = count;
      }
    }
    if (modeEven_1 != modeNod_1) {
      System.out.println(n - modeEvenCount_1 - modeNodCount_1);
    } else {
      int ans_1 = n - modeEvenCount_1 - modeNodCount_2;
      int ans_2 = n - modeEvenCount_2 - modeNodCount_1;
      System.out.println(ans_1 < ans_2 ? ans_1 : ans_2);
    }
  }

}
