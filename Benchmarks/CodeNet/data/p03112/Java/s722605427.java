
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  static int mod = 1000000007;
  static int[] matchNum = {2, 5, 5, 4, 5, 6, 3, 7, 6};

  public static void main(String[] args) throws FileNotFoundException {

//    Scanner cin = new Scanner(new FileReader("input.txt"));
    Scanner cin = new Scanner(System.in);

    int a = cin.nextInt();
    int b = cin.nextInt();
    int q = cin.nextInt();

    long[] shrine = new long[a + 2];
    long[] temple = new long[b + 2];
    long[] query = new long[q];
    shrine[0] =  -(long)Math.pow(10,12);
    shrine[a + 1] = (long)Math.pow(10,12);
    temple[0] = -(long)Math.pow(10,12);
    temple[b + 1] = (long)Math.pow(10,12);
    for (int i = 1; i < a + 1; i++) {
      shrine[i] = cin.nextLong();
    }
    for (int i = 1; i < b + 1; i++) {
      temple[i] = cin.nextLong();
    }
    for (int i = 0; i < q; i++) {
      query[i] = cin.nextLong();
    }

    for (int i = 0; i < q; i++) {
      long pos = query[i];
//      long lShrine = 0, rShrine = 0, lTemple = 0, rTemple = 0;
      int indexS = 0;
      int indexT = 0;

      int bb=0,ee=b;
      while(ee-bb>1){
        int mid = (bb+ee)/2;
        if(temple[mid]<pos){
          bb = mid;
        } else {
          ee = mid;
        }
      }
      indexT = bb;

      bb=0;
      ee=b;
      while(ee-bb>1){
        int mid = (bb+ee)/2;
        if(shrine[mid]<pos){
          bb = mid;
        } else {
          ee = mid;
        }
      }
      indexS = bb;
//      System.out.println("pos shrine "+indexS+" pos temple " + indexT);
      long res = Long.MAX_VALUE;

      for (int j = 0; j < 2; j++) {

        for (int k = 0;k<2;k++) {
          long dis1 = Math.abs(pos - shrine[indexS+j]) + Math.abs(shrine[indexS+j] - temple[indexT+k]);
          long dis2 = Math.abs(pos - temple[indexT+k]) + Math.abs(shrine[indexS+j] - temple[indexT+k]);
          res = Math.min(res, Math.min(dis1, dis2));
        }

      }
      System.out.println(res);

    }

  }


}