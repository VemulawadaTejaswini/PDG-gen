import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
  private static final long modulo = (long)(Math.pow(10, 9) + 7);

  public static void main(String[] args) throws Exception {
    try (final var stdin = new InputStreamReader(System.in);
         final var br = new BufferedReader(stdin)) {
      final var s = br.readLine().split(" ");
      final var n = Integer.parseInt(s[0]);
      final var k = Integer.parseInt(s[1]);

      final var positives = new ArrayList<Long>();
      final var negatives = new ArrayList<Long>();
      var zeroCount = 0;

      final var alist = br.readLine().split(" ");
      for (String astr: alist) {
        var a = Long.parseLong(astr);
        if (a > 0) {
          positives.add(a);
        } else if (a < 0) {
          negatives.add(-a);
        } else {
          zeroCount++;
        }
      }

      positives.sort(Long::compareTo);
      negatives.sort(Long::compareTo);

      int positiveIdxDesc = positives.size() - 1;
      int positiveIdxAsc = 0;
      int negativeIdxDesc = negatives.size() - 1;
      int negativeIdxAsc = 0;
      int rest = k;
      long sumDesc = 1;
      long sumAsc = 1;

      while (rest >= 2) {
        // calc desc
        long multiplierByPositiveDesc = positiveIdxDesc >= 1 ?
                                        positives.get(positiveIdxDesc) * positives.get(positiveIdxDesc - 1) :
                                        0;
        long multiplierByNegativeDesc = negativeIdxDesc >= 1 ?
                                        negatives.get(negativeIdxDesc) * negatives.get(negativeIdxDesc - 1) :
                                        0;

        long multiplierByPositiveAsc = positiveIdxAsc < positives.size() - 1 ?
                                       positives.get(positiveIdxAsc) * positives.get(positiveIdxAsc + 1) :
                                       0;
        long multiplierByNegativeAsc = negativeIdxAsc < negatives.size() - 1 ?
                                       negatives.get(negativeIdxAsc) * negatives.get(negativeIdxAsc + 1) :
                                       0;

        if (positiveIdxDesc == 0 && negativeIdxDesc == 0) {
          break;
        }

        // calc desc
        if (multiplierByPositiveDesc > multiplierByNegativeDesc) {
          sumDesc = (sumDesc * positives.get(positiveIdxDesc)) % modulo;
          sumDesc = (sumDesc * positives.get(positiveIdxDesc - 1)) % modulo;
          positiveIdxDesc -= 2;
        } else {
          sumDesc = (sumDesc * negatives.get(negativeIdxDesc)) % modulo;
          sumDesc = (sumDesc * negatives.get(negativeIdxDesc - 1)) % modulo;
          negativeIdxDesc -= 2;
        }

        // calc asc
        if (multiplierByPositiveAsc > multiplierByNegativeAsc) {
          sumAsc = (sumAsc * positives.get(positiveIdxAsc)) % modulo;
          sumAsc = (sumAsc * positives.get(positiveIdxAsc + 1)) % modulo;
          positiveIdxAsc += 2;
        } else {
          sumAsc = (sumAsc * negatives.get(negativeIdxAsc)) % modulo;
          sumAsc = (sumAsc * negatives.get(negativeIdxAsc + 1)) % modulo;
          negativeIdxAsc += 2;
        }

        rest -= 2;
      }

      if (rest >= 3) {
        System.out.println(0);
      } else if (rest == 2) {
        if (zeroCount > 0) {
          System.out.println(0);
        } else if (positives.size() > 0) {
          sumDesc = (sumDesc * positives.get(0)) % modulo;
          sumDesc = (sumDesc * -negatives.get(0)) % modulo;
          sumDesc += modulo;
          sumDesc %= modulo;
          System.out.println(sumDesc);
        }
      } else if (rest == 1) {
        if (positiveIdxDesc >= 0) {
          sumDesc = (sumDesc * positives.get(positiveIdxDesc)) % modulo;
          System.out.println(sumDesc);
        } else if (zeroCount >= 1) {
          sumDesc = 0;
          System.out.println(sumDesc);
        } else {
          sumAsc = (sumAsc * -negatives.get(negativeIdxAsc)) % modulo;
          sumAsc += modulo;
          sumAsc %= modulo;
          System.out.println(sumAsc);
        }
      } else {
        System.out.println(sumDesc);
      }
    }
  }
}
