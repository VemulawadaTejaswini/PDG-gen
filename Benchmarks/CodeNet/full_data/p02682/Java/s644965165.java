import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // abc167_a();
    abc167_b();
    // abc168_a();
    // abc168_b();
    // abc168_c();
    // abc169_a();
    // abc169_b();
    // abc169_c();
    // abc169_d();
    // abc170_a();
    // abc170_b();
    // abc170_c();
    // abc170_d();
    // abc171_a();
    // abc171_b();
    // abc171_c();
    // abc171_d();
    // abc172_a();
    // abc172_b();
    // abc172_c();
    // abc173_a();
    // abc173_b();
    // abc173_c();
  }

  // int 2147483648 [ 2 * 10(9)]
  // long 9223372036854775808 [ 9 * 10(18)]

  public static void abc167_a() {
    try (Scanner sc = new Scanner(System.in)) {
      String s = sc.next();
      String t = sc.next();

      if (s.equals(t.substring(0, t.length() - 1))) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc167_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int a = parseI(sc.next());
      int b = parseI(sc.next());
      int c = parseI(sc.next());
      int k = parseI(sc.next());

      if (k <= a + b) {
        System.out.println(a);
      } else {
        System.out.println(a + ((k - a - b) * -1));
      }
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc168_a() {
    try (Scanner sc = new Scanner(System.in)) {
      String n = sc.next();
      Character[] hon = { '2', '4', '5', '7', '9' };
      char[] pon = { '0', '1', '6', '8' };

      for (Character ass : hon) {
        if (ass.equals(n.charAt(n.length() - 1))) {
          System.out.println("hon");
          return;
        }
      }
      for (Character ass : pon) {
        if (ass.equals(n.charAt(n.length() - 1))) {
          System.out.println("pon");
          return;
        }
      }
      System.out.println("bon");
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc168_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int k = parseI(sc.next());
      String s = sc.next();
      String comma = "...";

      if (s.length() <= k) {
        System.out.println(s);
      } else {
        System.out.println(s.substring(0, k).concat(comma));
      }

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc168_c() {
    try (Scanner sc = new Scanner(System.in)) {
      int a = parseI(sc.next());
      int b = parseI(sc.next());
      int h = parseI(sc.next());
      int m = parseI(sc.next());

      int hour = h * 60 + m;
      int min = m * 12;

      int ass1 = min <= hour ? hour : min;
      int ass2 = ass1 == hour ? min : hour;

      double deg = ((double) ass1 - ass2);

      deg = 360 < deg ? (720 - deg) / 2 : deg / 2;

      double ans = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)
        - (2 * a * b * Math.cos(deg * (Math.PI / 180))));

      System.out.println(ans);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc169_a() {
    try (Scanner sc = new Scanner(System.in)) {
      int a = parseI(sc.next());
      int b = parseI(sc.next());
      System.out.println(a * b);
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc169_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = parseI(sc.next());
      Long[] a = new Long[n];

      for (int i = 0; i < n; i++) {
        a[i] = parseL(sc.next());
        if (a[i] == 0L) {
          System.out.println(0);
          return;
        }
      }
      Arrays.sort(a, Collections.reverseOrder());

      BigInteger multiTotal = parseBigI("1");
      for (long value : a) {
        multiTotal = multiTotal.multiply(BigInteger.valueOf(value));
        if (0 < multiTotal.compareTo(parseBigI("1000000000000000000"))) {
          System.out.println(-1);
          return;
        }
      }
      System.out.println(multiTotal);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void abc169_c() {
    try (Scanner sc = new Scanner(System.in)) {
      BigDecimal a = parseBigD(sc.next());
      BigDecimal b = parseBigD(sc.next());
      System.out.println(a.multiply(b).setScale(0, RoundingMode.DOWN));
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc169_d() {
    try (Scanner sc = new Scanner(System.in)) {
      long n = parseL(sc.next());

      long divNum = 0L;
      long ansCnt = 0L;

      while (true) {
        if (divNum == 1) {
          System.out.println(ansCnt);
          return;
        }
      }
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc170_a() {
    try (Scanner sc = new Scanner(System.in)) {
      int[] x = new int[5];
      int ans = 0;
      for (int i = 0; i < 5; i++) {
        x[i] = parseI(sc.next());
        if (i != 0 && x[i] == 0) {
          ans = x[i - 1] + 1;
        }
      }
      if (ans == 0) {
        ans = x[1] - 1;
      }
      System.out.println(ans);
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc170_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int body = parseI(sc.next());
      int leg = parseI(sc.next());
      boolean flg = false;

      for (int x = 0; x <= body; x++) {
        if (2 * x + 4 * (body - x) == leg) {
          flg = true;
        }
      }
      System.out.println(flg ? "Yes" : "No");

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc170_c() {
    try (Scanner sc = new Scanner(System.in)) {
      int x = parseI(sc.next());
      int n = parseI(sc.next());
      List<Integer> p = new ArrayList<Integer>();

      for (int i = 0; i < n; i++) {
        p.add(parseI(sc.next()));
      }
      if (!p.contains(x)) {
        System.out.println(x);
        return;
      }
      for (int i = 1; i <= n / 2 + 1; i++) {
        if (!p.contains(x - i)) {
          System.out.println(x - i);
          break;
        } else if (!p.contains(x + i)) {
          System.out.println(x + i);
          break;
        }
      }
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc170_d() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = parseI(sc.next());
      int[] a = new int[n];

      int ans = 0;

      for (int i = 0; i < n; i++) {
        a[i] = parseI(sc.next());
      }

      Arrays.sort(a);
      int[] allL = new int[(int) Math.pow(10, 6) + 1];
      Arrays.fill(allL, 0);

      for (int i = 0; i < a.length; i++) {
        if (1 < allL[a[i]]) {
          continue;
        }
        allL[a[i]]++;

        int multiNum = 2;
        while (a[i] * multiNum < allL.length) {
          allL[a[i] * multiNum] += 2;
          multiNum++;
        }
      }

      for (int i = 0; i < a.length; i++) {
        if (allL[a[i]] < 2) {
          ans++;
        }
      }

      System.out.println(ans);

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void abc171_a() {
    try (Scanner sc = new Scanner(System.in)) {
      String a = sc.next();
      if (Character.isUpperCase(a.charAt(0))) {
        System.out.println("A");
      } else {
        System.out.println("a");
      }
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc171_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = parseI(sc.next());
      int k = parseI(sc.next());

      int[] prices = new int[n];
      for (int i = 0; i < n; i++) {
        prices[i] = parseI(sc.next());
      }
      Arrays.sort(prices);

      int ans = 0;
      while (0 < k) {
        ans += prices[k - 1];
        k--;
      }
      System.out.println(ans);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc171_c() {
    try (Scanner sc = new Scanner(System.in)) {

      long number = parseL(sc.next());
      char a = 'a';

      String ans = "";

      long divideCnt = 0;

      divideCnt = (number - 1) / 26;
      ans =
        number % 26 == 0 ? "z" : String.valueOf((char) (a + number % 26 - 1));

      while (true) {
        if (0 == divideCnt) {
          break;
        }
        ans = divideCnt % 26 == 0 ? "z" + ans
          : String.valueOf((char) (a + divideCnt % 26 - 1) + ans);
        divideCnt = (divideCnt - 1) / 26;
      }

      System.out.println(ans);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc171_d() {
    try (Scanner sc = new Scanner(System.in)) {

      int chListCnt = parseI(sc.next());
      long[] allNumCnt = new long[(int) Math.pow(10, 5) + 1];
      Arrays.fill(allNumCnt, 0L);

      long sum = 0;

      for (int i = 0; i < chListCnt; i++) {
        int num = parseI(sc.next());
        allNumCnt[num] += 1;
        sum += num;
      }
      int chCnt = parseI(sc.next());
      int[][] beAf = new int[chCnt][2];
      for (int i = 0; i < chCnt; i++) {
        beAf[i][0] = parseI(sc.next());
        beAf[i][1] = parseI(sc.next());
      }

      long diffMultiNum = 0;

      for (int[] changeTarget : beAf) {
        diffMultiNum = allNumCnt[changeTarget[0]];
        if (changeTarget[0] < changeTarget[1]) {
          sum +=
            changeTarget[1] * diffMultiNum - changeTarget[0] * diffMultiNum;
        } else {
          sum -=
            changeTarget[0] * diffMultiNum - changeTarget[1] * diffMultiNum;
        }
        allNumCnt[changeTarget[0]] = 0;
        allNumCnt[changeTarget[1]] += diffMultiNum;
        System.out.println(sum);
      }

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc172_a() {
    try (Scanner sc = new Scanner(System.in)) {
      int a = parseI(sc.next());

      System.out.println(a + (int) Math.pow(a, 2) + (int) Math.pow(a, 3));
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc172_b() {
    try (Scanner sc = new Scanner(System.in)) {
      String s = sc.next();
      String t = sc.next();
      int ansCnt = 0;
      for (int i = 0; i < s.length(); i++) {
        if (!parseS(s.charAt(i)).equals(parseS(t.charAt(i)))) {
          ansCnt++;
        }
      }
      System.out.println(ansCnt);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc172_c() {
    try (Scanner sc = new Scanner(System.in)) {
      int n = parseI(sc.next());
      int m = parseI(sc.next());
      int k = parseI(sc.next());
      long[] nList = new long[n + 1];
      long[] mList = new long[m + 1];
      nList[0] = 0;
      mList[0] = 0;
      for (int i = 1; i <= n; i++) {
        nList[i] = nList[i - 1] + parseI(sc.next());
      }
      for (int i = 1; i <= m; i++) {
        mList[i] = mList[i - 1] + parseI(sc.next());
      }
      int ansCnt = 0;
      for (int i = 0; i <= n; i++) {
        if (k < nList[i]) {
          break;
        }
        while (k - nList[i] < mList[m])
          m--;
        ansCnt = Math.max(ansCnt, i + m);
      }
      System.out.println(ansCnt);
    }
  }

  public static void abc173_a() {
    try (Scanner sc = new Scanner(System.in)) {
      int payment = parseI(sc.next());
      int max = 10000;
      int thou = 1000;

      System.out.println((max - payment) % thou);
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc173_b() {
    try (Scanner sc = new Scanner(System.in)) {
      int num = parseI(sc.next());

      // AC
      // WA
      // TLE
      // RE x 0
      int[] ansCount = new int[4];
      final String[] err = { "AC", "WA", "TLE", "RE" };
      Arrays.fill(ansCount, 0);

      for (int i = 0; i < num; i++) {
        String ans = sc.next();
        switch (ans) {
          case "AC":
            ansCount[0]++;
            break;
          case "WA":
            ansCount[1]++;
            break;
          case "TLE":
            ansCount[2]++;
            break;
          case "RE":
            ansCount[3]++;
            break;
        }
      }
      int count = 0;
      for (int answer : ansCount) {
        System.out.println(err[count] + " x " + answer);
        count++;
      }
    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static void abc173_c() {
    try (Scanner sc = new Scanner(System.in)) {
      int row = parseI(sc.next());
      int column = parseI(sc.next());
      int checkBlackCount = parseI(sc.next());
      int existBlack = 0;
      int ansCount = 0;
      int[][] inputList = new int[row][column];
      String input = "";
      for (int i = 0; i < row; i++) {
        input = sc.next();
        for (int x = 0; x < column; x++) {
          inputList[i][x] =
            parseI(parseS(input.charAt(x)).replace(".", "0").replace("#", "1"));
        }
      }

      for (int i = 0; i < (1 << row); i++) {
        for (int x = 0; x < (1 << column); x++) {

          for (int chRownum = 0; chRownum < row; chRownum++) {
            for (int chColNum = 0; chColNum < column; chColNum++) {
              if (inputList[chRownum][chColNum] == 1
                && ((i >> chRownum) & 1) == 0 && ((x >> chColNum) & 1) == 0) {
                existBlack++;
              }
            }
          }
          if (existBlack == checkBlackCount) ansCount++;
          existBlack = 0;

        }
      }
      System.out.println(ansCount);

    } catch (Exception e) {
      System.out.println("エラー" + e);
    }
  }

  public static int parseI(String value) {
    return Integer.parseInt(value);
  }

  public static long parseL(String value) {
    return Long.parseLong(value);
  }

  public static double parseD(String value) {
    return Double.parseDouble(value);
  }

  public static <T> String parseS(T value) {
    return String.valueOf(value);
  }

  public static BigDecimal parseBigD(String value) {
    return new BigDecimal(value);
  }

  public static BigInteger parseBigI(String value) {
    return new BigInteger(value);
  }

}
